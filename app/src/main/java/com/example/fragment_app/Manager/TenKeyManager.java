//package com.example.fragment_app.Manager;
//
//
//import static jp.co.lecip.manager.ConditionIdEnum.MANUAL_COMPLETE;
//
//import android.os.Build;
//import android.widget.TextView;
//
//import androidx.annotation.RequiresApi;
//
//import jp.co.lecip.ConstantNumber;
//import jp.co.lecip.data.CurrentOperateInfo;
//import jp.co.lecip.data.readercontrol.ReaderControlInfo;
//import jp.co.lecip.view.otherbutton.LoginPasswordButton;
//
//public class TenKeyManager implements ConstantNumber {
//    public int MAX_NUM;
//    public int MIN_NUM;
//    public String inputNumber;
//    protected TextView tv;
//
//
//    public TenKeyManager(){
//
//    }
//    /**
//     * 概要：コンストラクタ
//     * @param min_num :入力できる最小値
//     * @param max_num :入力できる最大値
//     */
//    public TenKeyManager(int min_num, int max_num, TextView tv) {
//        MIN_NUM = min_num;
//        MAX_NUM = max_num;
//        this.tv = tv;
//    }
//
//    public TenKeyManager(int min_num, int max_num){
//        MIN_NUM = min_num;
//        MAX_NUM = max_num;
//        initialInputNumber();
//    }
//
//    /**
//     * 概要：入力数字の初期化処理
//     */
//    public void initialInputNumber(){
//        inputNumber = "";
//    }
//
//    /**
//     * 概要：0～9キーの入力時処理
//     * @param key :入力されたキー
//     * @return	  :入力された文字列.
//     */
//    public String inputKey( int key ){
//        //ヌルチェック
//        if(inputNumber == null){
//            setInitialText();       //nullが入ってきた場合は初期化
//        }
//        //押下された数字をinputNumber(文字列)に加える
//        inputNumber += String.valueOf(key);
//        tv.setText(inputNumber);
//        if ((Integer.parseInt(inputNumber) > MAX_NUM)) {
//            //入力桁数が最大桁数を超えた場合は初期化する
//            setInitialText();
//        }
//
//        return inputNumber;
//    }
//
//    /**
//     * 概要：ACキーの入力時処理
//     */
//    public void inputAcKey(){
//        setInitialText();
//    }
//
//    /**
//     * 概要：確定キーの入力時処理
//     */
//
//    @RequiresApi(api = Build.VERSION_CODES.O)
//    public void inputDecideKey(){
//        int num = 0;
//        ConditionManager cm = new ConditionManager();
//        ConditionIdEnum conditionIdEnum = cm.getConditionId();
//        try{
//            num = Integer.parseInt(inputNumber);
//        }catch (NumberFormatException e){
//
//        }
//        switch (conditionIdEnum) {
//            case AMOUNT_SET:
//                onDecideClickAtAmountSet(num);
//                break;
//            case SECTION_SET:
//                onDecideClickAtSectionSet(num);
//                break;
//            case MAINTE_STOP_SEQUENCE:
//            case MAINTE_ROUTE_ID:
//                onDecideClickAtOperationInfoItems(num, conditionIdEnum);
//                break;
//            case MAINTE_VOLUME:
//            case MAINTE_OFFICE_NUMBER:
//            case MAINTE_PAY_DISP_TIME:
//            case MAINTE_READER_BRIGHTNESS:
//            case MAINTE_BACKLIGHT_TIME:
//            case MAINTE_CONTROLLER_ID_CODE:
//            case MAINTE_READER_VOLUME_1_CODE:
//            case MAINTE_READER_VOLUME_2_CODE:
//            case MAINTE_READER_VOLUME_3_CODE:
//            case MAINTE_READER_VOLUME_4_CODE:
//            case MAINTE_QR_BRIGHTNESS:
//                onDecideClickAtVolumeOfficeDisp(num,conditionIdEnum);
//                break;
//            case MAINTE_USER_CODE:
//                onDecideClickUserCode(num,conditionIdEnum);
//                break;
//            case MAINTE_VEHICLE_NUMBER:
//            case MAINTE_SEQUENCE_NUMBER:
//                onDecideClickAtVehicleSeq(conditionIdEnum);
//                break;
//            case MAINTE_LOGIN_PASSWORD:
//                onDecideClickAtLoginPassword(conditionIdEnum);
//                break;
//            default:
//                break;
//        }
//    }
//
//
//    /**
//     * 概要：テキストビューに値をセット
//     * @param tv
//     */
//    public void setTextView(TextView tv) {
//        this.tv = tv;
//    }
//
//    /**
//     * 概要：テキストビューの値をゲット
//     * @return tv
//     */
//    public TextView getTextView(){
//        return tv;
//    }
//
//    /**
//     * 概要：inputNumberの初期化後inputNumberをsetTextする。
//     */
//    public void setInitialText(){
//        initialInputNumber();
//        tv.setText(inputNumber);
//    }
//
//    /**
//     * 概要:金額設定時に確定をクリックした際の処理
//     * @param num:入力した数字
//     */
//    private void onDecideClickAtAmountSet(int num){
//        ConditionManager cm = new ConditionManager();
//        ManualSettingManager msm = new ManualSettingManager();
//        ReaderControlInfo readerControlInfo = new ReaderControlInfo();
//        if (msm.canSetAmount(num)) {
//            msm.setManualSettingStatus(MANUAL_SETTING_DECIDE);
//            cm.setRequestId(MANUAL_COMPLETE);
//        } else {
//            setInitialText();
//        }
//    }
//
//    /**
//     * 概要:区間設定時に確定をクリックした際の処理
//     * @param num:入力した数字
//     */
//
//    private void onDecideClickAtSectionSet(int num){
//        ConditionManager cm = new ConditionManager();
//        ManualSettingManager msm = new ManualSettingManager();
//        ReaderControlInfo readerControlInfo = new ReaderControlInfo();
//        if (msm.canSectionSet(num)) {
//            msm.setManualSettingStatus(MANUAL_SETTING_DECIDE);
//            cm.setRequestId(MANUAL_COMPLETE);
//        } else {
//            setInitialText();
//        }
//    }
//
//    /**
//     * 概要:系統・駒番号時に確定をクリックした際の処理
//     * @param num:入力した数字
//     * @param conditionIdEnum:コンディション
//     */
//    private void onDecideClickAtOperationInfoItems(int num,ConditionIdEnum conditionIdEnum){
//        if ((num >= MIN_NUM) && (num <= MAX_NUM)) {
//            ConditionManager cm = new ConditionManager();
//            MaintenanceManager mm = new MaintenanceManager();
//            CurrentOperateInfo currentOperateInfo = new CurrentOperateInfo();
//
//            // 系統・駒番号を現在運賃情報に保存
//            switch (conditionIdEnum) {
//                case MAINTE_ROUTE_ID:
//                    currentOperateInfo.setRouteId(String.valueOf(num));
//                    break;
//                case MAINTE_STOP_SEQUENCE:
//                    currentOperateInfo.setStrStopSequence(String.valueOf(num));
//                    break;
//                default:
//                    //TODO：何度も切り替えるのではなく、旧関数を再利用する方法を考えること
//                    break;
//
//            }
//            cm.setRequestId(ConditionIdEnum.MAINTENANCE_MENU);
//        } else {
//            setInitialText();
//        }
//    }
//    /**
//     * 概要:制御器ID, 音量設定、営業所番号設定、精算結果表示時間、ユーザコード設定時に確定を押した際の処理
//     * @param num:入力した数字
//     * @param conditionIdEnum:コンディション
//     */
//    @RequiresApi(api = Build.VERSION_CODES.O)
//    private void onDecideClickAtVolumeOfficeDisp(int num,ConditionIdEnum conditionIdEnum){
//        if ((num >= MIN_NUM) && (num <= MAX_NUM)) {
//            MaintenanceManager mm = new MaintenanceManager();
//            ConditionManager cm = new ConditionManager();
//            ConfigFileManager cfm = new ConfigFileManager();
//            cm.setRequestId(ConditionIdEnum.MAINTENANCE_MENU);
//            cfm.writeConfigFile(inputNumber,cfm.getConfigFileData(conditionIdEnum));
//            mm.getOtherButtonIdData().setConfigVal(Integer.parseInt(cfm.getValue(conditionIdEnum)));
//        } else {
//            setInitialText();
//        }
//    }
//
//    @RequiresApi(api = Build.VERSION_CODES.O)
//    private void onDecideClickUserCode(int num,ConditionIdEnum conditionIdEnum){
//        if ((num >= MIN_NUM) && (num <= MAX_NUM)) {
//            MaintenanceManager mm = new MaintenanceManager();
//            ConditionManager cm = new ConditionManager();
//            ConfigFileManager cfm = new ConfigFileManager();
//            cm.setRequestId(ConditionIdEnum.MAINTENANCE_MENU);
//            String hex = Integer.toHexString(Integer.parseInt(inputNumber));
//            cfm.writeConfigFile(hex,cfm.getConfigFileData(conditionIdEnum));
//            mm.getOtherButtonIdData().setConfigVal(Integer.parseInt(cfm.getValue(conditionIdEnum),16));
//        } else {
//            setInitialText();
//        }
//    }
//
//
//
//    /**
//     * 概要:車両番号設定、連番設定時に確定を押した際の処理
//     * @param conditionIdEnum:コンディション
//     */
//    @RequiresApi(api = Build.VERSION_CODES.O)
//    private void onDecideClickAtVehicleSeq(ConditionIdEnum conditionIdEnum){
//        if(inputNumber.length() == VEHICLE_DIGIT){
//            ConfigFileManager cfm = new ConfigFileManager();
//            ConditionManager cm = new ConditionManager();
//            MaintenanceManager mm = new MaintenanceManager();
//            cm.setRequestId(ConditionIdEnum.MAINTENANCE_MENU);
//            cfm.writeConfigFile(inputNumber,cfm.getConfigFileData(conditionIdEnum));
//            mm.getOtherButtonIdData().setConfigStr(cfm.getValue(conditionIdEnum));
//        }
//        else{
//            setInitialText();
//        }
//    }
//
//    /**
//     * 概要:ログインパスワード設定時に確定を押した際の処理
//     * @param conditionIdEnum:コンディション
//     */
//    @RequiresApi(api = Build.VERSION_CODES.O)
//    private void onDecideClickAtLoginPassword(ConditionIdEnum conditionIdEnum){
//        if(inputNumber.length() == LOGIN_PASSWORD_DIGIT){
//            LoginPasswordButton lpb = new LoginPasswordButton();
//            ConditionManager cm = new ConditionManager();
//            ConfigFileManager cfm = new ConfigFileManager();
//            cm.setRequestId(ConditionIdEnum.MAINTENANCE_MENU);
//            cfm.writeConfigFile(inputNumber,cfm.getConfigFileData(conditionIdEnum));
//            lpb.setConfigStr(cfm.getValue(ConditionIdEnum.MAINTE_LOGIN_PASSWORD));
//        }
//        else{
//            setInitialText();
//        }
//    }
//}
