//package com.example.fragment_app.Manager;
//
//import android.util.Log;
//
//import jp.co.lecip.ConstantNumber;
//
//public class PasswordManager extends TenKeyManager implements ConstantNumber {
//	private boolean passwordChkResult;
//	private static boolean isChkPwWhenStart;
//
//	/**
//	 * 概要：コンストラクタ
//	 */
//	public PasswordManager(){
//		initialInputNumber();
//	}
//
//	/**
//	 * 概要：キー入力処理
//	 * @param key : 入力キー
//	 * @return : 表示文字列（入力文字数分 "*" となる）
//	 */
//	public String inputKey( int key ){
//		inputNumber += Integer.toString(key);
//
//		if(inputNumber.length() > LOGIN_PASSWORD_DIGIT){
//			initialInputNumber();
//		}
//		else {
//		}
//		Log.d("LAQRA", "inputKey: " + key);
//
//		return makeShowText();
//	}
//
//	/**
//	 * 概要：表示用文字列作成
//	 * @return : 表示文字列（入力文字数分 "*" となる）
//	 */
//	public String getShowText(){
//		return makeShowText();
//	}
//
//	/**
//	 * 概要：表示用文字列作成
//	 * @return : 表示文字列（入力文字数分 "*" となる）
//	 */
//	private String makeShowText(){
//
//		Log.d("LAQRA", "inputNumber: " + inputNumber + " length: " + inputNumber.length());
//		String ret_str = "";
//		for( int i = 0; i < (LOGIN_PASSWORD_DIGIT - inputNumber.length()); i++){
//			ret_str += "－";
//		}
//
//		for( int j = 0; j < inputNumber.length(); j++){
//			ret_str += "＊";
//		}
//		return ret_str;
//	}
//
//	/**
//	 * 概要：キー入力処理
//	 * @return : 入力されているデータを返す
//	 */
//	public String getInputdata(){
//		return inputNumber;
//	}
//
//	/**
//	 * 概要：キー入力処理
//	 * @return : true -> パスワード一致
//	 * 			false -> パスワード不一致
//	 */
//	public boolean checkPassword(){
//		boolean isMatch = false;
//		ConfigFileManager configFileManager = new ConfigFileManager();
//		if(inputNumber.equals(configFileManager.getValue(ConditionIdEnum.MAINTE_LOGIN_PASSWORD))){
//			isMatch = true;
//		}
//		else{
//			initialInputNumber();
//			if(tv != null) {
//				tv.setText(makeShowText());
//			}
//		}
//		setIsChkPwWhenStart(isMatch);
//		return isMatch;
//	}
//
//	/**
//	 * 概要：確定キーの入力時処理
//	 */
//	@Override
//	public void inputDecideKey(){
//		passwordChkResult = checkPassword();
//	}
//
//	/**
//	 * 概要：入力されたパスワード判定結果取得
//	 * @return
//	 */
//	public boolean isPasswordChkResult() {
//		return passwordChkResult;
//	}
//
//	public void setPasswordChkResult(boolean passwordChkResult) {
//		this.passwordChkResult = passwordChkResult;
//	}
//
//	/**
//	 * 概要：利用禁止の画面を表示するための入力されたパスワード判定結果取得
//	 * @return
//	 */
//	public static boolean isChkPwWhenStart() {
//		return isChkPwWhenStart;
//	}
//
//	public static void setIsChkPwWhenStart(boolean isChkPwWhenStart) {
//		PasswordManager.isChkPwWhenStart = isChkPwWhenStart;
//	}
//
//	/**
//	 * 概要：起動時の入力されたパスワード判定結果取得
//	 * @return
//	 */
//
//
//	@Override
//	public void setInitialText(){
//		super.setInitialText();
//		tv.setText(makeShowText());
//	}
//}
