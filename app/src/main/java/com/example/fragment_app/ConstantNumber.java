// package com.example.fragment_app;
//
// import jp.co.lecip.data.readerinfo.IPaddressPortNo;
//
// public interface ConstantNumber {
//
//	// デバッグ用
//	boolean DEBUG = false;
//	String TAG = "LAQRA";
//
//	// BIT定義
//	byte D0_BIT = 0x01;
//	byte D1_BIT = 0x02;
//	byte D2_BIT = 0x04;
//	byte D3_BIT = 0x08;
//	byte D4_BIT = 0x10;
//	byte D5_BIT = 0x20;
//	byte D6_BIT = 0x40;
//	byte D7_BIT = (byte) 0x80;
//
//
//
//	// 定数関連
//	// フラグメント定義数
//	int NUMBER_OF_FRAGMENT = 13;
//	int NUMBER_OF_PASSENGER_TYPE = 4;
//
//
//	// 設定関連
//	int FARE_BASE_10_YEN = 10;
//	int FARE_BASE__1_YEN = 1;
//
//	// 表示関連
//	int INVISIBLE = 0;		// 非表示
//	int VISIBLE = 1;		// 表示
//	int GONE = 2;			//GONE
//
//	//　桁数
//	int SECTION_SET_DEGIT = 2;		//整琈�番号は2桁まで入力可能
//	int AMOUNT_SET_DEGIT = 5;		//金額設定�5桁まで入力可能
//
//	// Error Manager
//	int ERR_SWITCH_INTERVAL = 2000;
//
//
//	// 手動設定関連
//	int MANUAL_SETTING_NONE = 0;
//	int MANUAL_SETTING_SETTING = 1;
//	int MANUAL_SETTING_DECIDE = 2;
//
//	int PASSENGER_TYPE_ADULT = 0;
//	int PASSENGER_TYPE_ADULT_D = 1;
//	int PASSENGER_TYPE_CHILD = 2;
//	int PASSENGER_TYPE_CHILD_D = 3;
//
//	int PASSENGER_ADULT_DEFAULT = 1;
//	int PASSENGER_ADULT_D_DEFAULT = 0;
//	int PASSENGER_CHILD_DEFAULT = 0;
//	int PASSENGER_CHILD_D_DEFAULT = 0;
//
//	//定期期限関連　
//	int PASS_VALID = 0; //定期期間内
//	int PASS_NEAR_INVALID = 1; //定期期限切れ間近
//	int PASS_INVALID =2 ; //定期期限切れ
//
//	// 通信関連
//	int SUM_TYPE_INTEX_HEX = 0;
//	int SUM_TYPE_SUM = 1;
//
//	// 上位機器(ExternalDevice)通信関連
//	String EX_DEV_STX = "02";
//	String EX_DEV_ETX = "03";
//	int EX_DEV_SIZE_DIGIT_BYTE = 2;
//	int EX_DEV_SUM_DIGIT_BYTE = 1;
//	int EX_DEV_CMD_DIGIT_BYTE = 1;
//	int EX_DEV_SEQ_DIGIT_BYTE = 0;
//	int EX_DEV_FIX_PART_LENGTH = 6;
//
//	int EX_DEV_RCV_PORT = 10010;
//	int EX_DEV_SND_PORT = 10010;
//	String EX_DEV_IP = "192.168.254.240";
//	int EX_DEV_BUF_SIZE = 13000;
//
//	byte OBC_COMM_STS = 0x00;
//	byte OBC_COMM_ROUTE_ID = 0x11;
//	byte OBC_COMM_BUSSTOP_INFO = 0x12;
//	byte OBC_COMM_FARE_INFO_10 = 0x13;
//	byte OBC_COMM_FARE_INFO__1 = 0x14;
//	byte OBC_COMM_CLOCK_INFO = 0x16;
//	byte OBC_COMM_STOP_SQ_NO = 0x17;
//	byte OBC_COMM_VERSION_INFO = 0x20;
//	byte OBC_COMM_BL_UPD_INFO = 0x30;
//
//		// CMD 11
//		int CMD_11_ROUTE_ID_OFFSET = 0;
//		int CMD_11_OPERATE_MODE_OFFSET = 4;
//		int CMD_11_QR_STS_OFFSET = 5;
//		int CMD_11_DIA_NO_OFFSET = 6;
//		int CMD_11_DIA_TYPE_OFFSET = 9;
//		int CMD_11_START_TIME_OFFSET = 10;
//		int CMD_11_LENGTH = 12;
//
//		// CMD 12
//		int CMD_12_STOP_NUM_SIZE = 1;
//		int CMD_12_STOP_CODE_SIZE  = 3;
//		int CMD_12_TICKET_CODE_SIZE = 1;
//		int CMD_12_START_TICKET_CODE_SIZE = 1;
//		int CMD_12_STOP_TYPE_SIZE = 1;
//		int CMD_12_PARAMETER_SIZE = 1;
//		int CMD_12_STOP_ATTRIBUTE_SIZE = 1;
//		int CMD_12_FARE_SIZE = 1;
//		int CMD_12_PASS_TIME_SIZE = 2;
//		int CMD_12_FARE_NUM_SIZE = 1;
//		int CMD_12_STOP_NAME_JP_SIZE = 24;
//		int CMD_12_STOP_NAME_EN_SIZE = 26;
//		int CMD_12_AREA_CODE_SIZE = 2;
//		int CMD_12_SAME_CODE_SIZE = 2;
//
//		// CMD13,14
//		int CMD_13_14_INDEX_SIZE = 1;
//		int CMD_13_14_NEXT_FLAG = 1;
//		int CMD_13_14_FARE_SIZE = 2;
//		int CMD_13_14_STOP_NUM_IN_COM = 32;
//		int CMD_13_14_FARE_NUM_IN_STOP = 100;
//
//
//
//
//		// CMD 17
//		int CMD_17_STOP_SQ_OFFSET = 6;
//
//
//	// スレッド間通信
//	// CommonView
//	int CVF_POS1_REQ = 1;
//	int CVF_POS2_REQ = 2;
//	int CVF_POS3_REQ = 3;
//	int CVF_POS4_REQ = 4;
//	int CVF_POS51_REQ = 51;
//	int CVF_POS52_REQ = 52;
//	int CVF_POS6_REQ = 6;
//	int PAY_RESULT_REQ = 100;
//
//
//	// PassengerNum
//	int PNS_SHOW_NUM = 0;
//
//
//	// エラー関連
//	// エラー発生タイプ
//	int ERR_TYPE_NON = 0;
//	int ERR_TYPE_CONTROLLER = 1;
//	int ERR_TYPE_QR_READER = 2;
//	int ERR_TYPE_PAYMENT = 3;
//	int ERR_TYPE_MASTER = 4;
//	int ERR_TYPE_VARIABLE = 5;
//	 int MSG_TYPE_HISTORY = 6;
//	int MSG_TYPE_NON = 100;
//	int MSG_TYPE_DEFAULT = 101;
//
//	// エラー表示色
//	int ERR_COLOR_NON = 0;
//	int ERR_COLOR_ERROR = 1;
//	int ERR_COLOR_WARNING = 2;
//	int MSG_COLOR_F_WARNING = 3;
//	int MSG_COLOR_WARNING = 4;
//	int MSG_COLOR_REVERSE = 5;
//	int MSG_COLOR_SELECT = 6;
//	int MSG_COLOR_SELECT_REV = 7;
//
//	// エラー履歴最大表示数
//	int ERR_DISPLAY_NUMBER = 50; //エラー履歴画面の表示件数
//
//	// エラーデータベース関連
//	int ERR_DB_INSERT = 0;
//	int ERR_DB_GET = 1;
//
//	int ERR_LIST_SHOW = 0;
//
//	// マスタ関連
//	int MASTER_MAX_SIZE = 0x200000;				// C言語処理部用マスタ最大サイズ
//	int ALL_MASTER_BUF_SIZE = 0x400000;
//	int CARD_TRANSACTION_OUTPUT_LEN = 0x0C00;	// 処理結果取得用データサイズ
//	int MASTER_OUTPUT_PARAM_NUM = 16;
//	int MASTER_OUTPUT_PARAM_START_OFFSET = 0x10;
//	int MASTER_OUTPUT_ERR_SIZE = 4;
//	int AMOUNT_DATA_START = 0x000014D;
//	int AMOUNT_DATA_SIZE = 3;
//
//
//	// 運賃マスタ
//	int FARE_MAS_YOBI_1_NUM = 4;
//	int FARE_MAS_YOBI_2_NUM = 1;
//	int FARE_MAS_YOBI_3_NUM = 11;
//	int FARE_MAS_YOBI_4_NUM = 14;
//	int FARE_MAS_YOBI_5_NUM = 2;
//	int FARE_MAS_YOBI_6_NUM = 192;
//
//	int FARE_MAS_FARE_MAX = 256;
//	int FARE_MAS_AREA_NUM = 8;
//	int FARE_MAS_STOP_TABLE_SIZE = 4128;
//
//	// 手動設定マスタ
//	int MANUAL_MAS_YOBI_1_NUM = 4;
//	int MANUAL_MAS_YOBI_2_NUM = 1;
//	int MANUAL_MAS_YOBI_3_NUM = 224;
//
//	//メンテナンスID
//	//------- NEW ---------------//
//	 int PROCESSING_STATUS_CONFIRM_ID = 1;
//	 int CHECK_PREVIOUS_HISTORY_ID = 2;
//	 int ERROR_HISTORY_VERIFY_ID = 3;
//	 int OPERATION_MODE_SETTING_ID = 4;
//	 int MAINTENANCE_ID = 5;
//
//	//------- OLD ---------------//
//	int BALANCE_HISTORY_ID = 1;
////	int ERROR_HISTORY_VERIFY_ID = 2;
//	int USER_CONFIG_CHECK_ID = 3;
//	int LOG_OFF_ID = 4;
////	int MAINTENANCE_ID = 5;
//	 //------- END ---------------//
//
//	 //メンテナンス画面
//	 //------- NEW ---------------//
//	 int BUSINESS_CODE_ID = 8;
//	 int CONTROLLER_NUM_ID = 9;
//	 int SYSTEM_STOP_SERIAL_FIXED_NUMBER_ID = 10;
//	 int VEHICLE_ID = 11;
//	 int OFFICE_NUM_ID = 12;
//	 int VEHICLE_NUM_ID = 13;
//	 int PANEL_SCREEN_BRIGHTNESS_ID = 14;
//	 int READER_SCREEN_BRIGHTNESS_ID = 15;
//	 int READER_VOLUME_ID = 16;
//	 int READER_DOOR_SIGNAL_DETECT_LV_ID = 17;
//	 int HEADLIGHT_DETECT_LV_ID = 18;
//	 int BACKLIGHT_ID = 19;
//	 int HARD_TEST_ID = 20;
//	 int SOFT_VER_ID = 21;
//
//	 //----- 系統・駒番固定-------//
//	 int CHECK_ROUTE_ID_INT = 22;
//	 int ROUTE_ID_INT = 23;
//	 int STOP_SEQUENCE_INT = 24;
//
//	 //----- 操作盤画面輝度-------//
//	 int MID_DAY_ID = 25;
//	 int NIGHT_DAY_ID = 26;
//
//	 //----- リーダ音量-------//
//	 int READER_VOLUME1_ID = 26;
//	 int READER_VOLUME2_ID = 27;
//	 int READER_VOLUME3_ID = 28;
//	 int READER_VOLUME4_ID = 29;
//	 //----- 系統・駒番固定-------//
//	 int FEATURE_ENABLE_ID = 30;
//	 int FEATURE_DISABLE_ID = 31;
//
//	 //------- OLD ---------------//
//
//	int CLOCK_ID = 11;
////	int HARD_TEST_ID = 12;
//	int DATA_COLLECT_ID = 13;
////	int SOFT_VER_ID = 14;
//	int READER_ID = 15;
//	int QR_CTRL_ID = 20;
//	int QR_DOOR_ID = 21;
////	int BACKLIGHT_ID = 22;
//	int QR_BRIGHTNESS_ID = 23;
////	int VEHICLE_ID = 24;
////	int VEHICLE_NUM_ID = 25;
//	int SEQUENCE_NUM_ID = 26;
////	int OFFICE_NUM_ID = 27;
//	int USER_CODE_ID = 28;
//	int SYSTEM_ID = 31;
//	int CLOCK_MANUAL_ID = 41;
//	int CLOCK_AUTO_ID = 42;
//	int COMM_TEST_ID = 51;
//	int UPPER_MACHINE_ID = 52;
//	int LTE_ROOTER_ID = 53;
//	int QR_RIDE1_ID = 54;
//	int QR_RIDE2_ID = 55;
//	int QR_GET_OFF_ID = 56;
//
//
//	//乗車リーダ接続台数
//
//	int CONNECT_NUM_1_ID = 61;
//	int CONNECT_NUM_2_ID = 62;
//	int CONNECT_NUM_3_ID = 63;
//
//	//扉信号検出レベル(リーダ)
//	int READER_DOOR_LO_ID = 71;
//	int READER_DOOR_HI_ID = 72;
//
//	//扉信号検出レベル(制御部)
//	int QR_DOOR_LO_ID = 81;
//	int QR_DOOR_HI_ID = 82;
//	 // 履歴ページ目最低表示数
//	 int MIN_PAPER_NUMBER = 1;
//
//	 //------- END ---------------//
//
//	int READER_NUM_ID = 91;
//	int READER_DOOR_ID = 92;
//	int VOLUME_ID = 93;
//	int READER_BRIGHTNESS_ID = 94;
//	int PAY_RESULT_DISP_TIME_ID = 95;
//
//	int LOGIN_PASSWORD_ID = 101;
//	int TRANSACTION_SELECT_ID = 111;
//	int TRANSACTION_UPPER_ID = 112;
//	int TRANSACTION_LOWER_ID = 113;
//	//CycleControl
//	int CYCLE = 500;
//
//	//ソフトバージョン表示の優先度の最大値
//	int SOFT_VER_PRIORITY_MAX = 5;
//
//	// 乗車マスタ
//	int JOSYA_MAS_YOBI_1_NUM = 4;
//	int JOSYA_MAS_YOBI_2_NUM = 1;
//	int JOSYA_MAS_YOBI_3_NUM = 224;
//
//	//　乗降データ管理
//	int PASSENGER_REGITST_OK = 0;					// エラーなし
//	int PASSENGER_ALREADY_GOT_ON = -4200;			// 乗車済エラー
//	int PASSENGER_GET_OFF_0YEN = -4301;				// 運賃0円エラー
//	int PASSENGER_NOT_REGIST = -4600;				// 乗車未処理
//	int PASSENGER_ALREADY_PAYED = -4900;			// 精算済
//
//	// 乗降管理DBアクセス
//	int PASSENGER_INFO_DB_REGIST = 0;				// 新規登録
//	int PASSENGER_INFO_DB_UPDATE = 1;				// アップデート
//
///************************************************************/
///*					乗降リーダー接続管理					*/
///************************************************************/
//	public static final boolean QR_READER_GET_OFF = true;
//	public static final boolean QR_READER_RIDE_1  = true;
//	public static final boolean QR_READER_RIDE_2  = false;
//	public static final boolean QR_READER_RIDE_3  = false;
//	public static final boolean QR_READER_RIDE_4  = false;
//
//	public static final int QR_READER_UNIT_MAX = 2;     // 接続リーダー台数(降車と乗車の計)
//
//	public static enum ReaderNum {
//		ENUM_QR_READER_GET_OFF,
//		ENUM_QR_READER_RIDE_1,
//		ENUM_QR_READER_RIDE_2,
//		ENUM_QR_READER_RIDE_3,
//		ENUM_QR_READER_RIDE_4,
//	}
//
///************************************************************/
///*							UDP COMM						*/
///************************************************************/
//	/**
//	 * ポート
//	 */
//	public static final int UDP_PORT_QR_CTRL_GET_OFF		= 51001;	// QR制御部主局-QR降車従局
//	public static final int UDP_PORT_QR_CTRL_RIDE_1			= 51002;	// QR制御部主局-QR乗車1従局
//	public static final int UDP_PORT_QR_CTRL_RIDE_2			= 51003;	// QR制御部主局-QR乗車2従局
//	public static final int UDP_PORT_QR_CTRL_RIDE_3			= 51004;	// QR制御部主局-QR乗車3従局
//	public static final int UDP_PORT_QR_CTRL_RIDE_4			= 51005;	// QR制御部主局-QR乗車4従局
//
//	public static final int UDP_PORT_QR_READER_GET_OFF		= 52001;	// QR降車主局ポート番号
//	public static final int UDP_PORT_QR_READER_RIDE_1		= 52002;	// QR乗車1主局ポート番号
//	public static final int UDP_PORT_QR_READER_RIDE_2		= 52003;	// QR乗車2主局ポート番号
//	public static final int UDP_PORT_QR_READER_RIDE_3		= 52004;	// QR乗車3主局ポート番号
//	public static final int UDP_PORT_QR_READER_RIDE_4		= 52005;	// QR乗車4主局ポート番号
//
//
//	/**
//	 * IPアドレス
//	 */
//	public static final String UDP_IP_CTRL				= "192.168.254.30";	// 制御部のIPアドレス
//	public static final String UDP_IP_QR_GET_OFF		= "192.168.254.45";	// QR降車のIPアドレス
//	public static final String UDP_IP_QR_RIDE_1			= "192.168.254.46";	// QR乗車1のIPアドレス
//	public static final String UDP_IP_QR_RIDE_2			= "192.168.254.47";	// QR乗車2のIPアドレス
//	public static final String UDP_IP_QR_RIDE_3			= "192.168.254.48";	// QR乗車3のIPアドレス
//	public static final String UDP_IP_QR_RIDE_4			= "192.168.254.49";	// QR乗車4のIPアドレス
//
//	/**
//	 * ポートとIPアドレスのテーブル
//	 */
//	IPaddressPortNo[] IP_ADDRESS_PORT_NO_ARRAY = {new IPaddressPortNo(UDP_IP_QR_GET_OFF,UDP_PORT_QR_CTRL_GET_OFF),
//			new IPaddressPortNo(UDP_IP_QR_RIDE_1,UDP_PORT_QR_CTRL_RIDE_1),
//			new IPaddressPortNo(UDP_IP_QR_RIDE_2,UDP_PORT_QR_CTRL_RIDE_2),
//			new IPaddressPortNo(UDP_IP_QR_RIDE_3,UDP_PORT_QR_CTRL_RIDE_3),
//			new IPaddressPortNo(UDP_IP_QR_RIDE_4,UDP_PORT_QR_CTRL_RIDE_4)};
//
//
//	 // 送受信固定値定義
//	public static final String UDP_STX					= "02";		// STX
//	public static final String UDP_ETX					= "03";		// ETX
//
//	// QR制御部⇒QR乗車・QR降車コマンド別識別子定義
//	public static final String UDP_SEND_STATUS			= "00";		// ステータス通知&要求
//	public static final String UDP_RECEIVE_STATUS		= "01";		// ステータス通知&要求レスポンス
//
//	public static final String UDP_SEND_DISPLAY			= "10"; 	// 接客表示&要求
//	public static final String UDP_RECEIVE_DISPLAY		= "11";		// 接客表示&要求レスポンス
//
//	public static final String UDP_SEND_VERSION			= "90";		// バージョン要求
//	public static final String UDP_RECEIVE_VERSION		= "91";		// バージョン要求レスポンス
//
//	public static final String UDP_SEND_APL_TRANSFER	= "92";		// APL移行要求
//	public static final String UDP_RECEIVE_APL_TRANSFER	= "93";		// APL移行要求レスポンス
//
//	public static final String UDP_SEND_UPDATE			= "94";		// プログラム更新要求
//	public static final String UDP_RECEIVE_UPDATE		= "95";		// プログラム更新要求レスポンス
//
//	// QR乗車・QR降車⇒QR制御部コマンド別識別子定義(主従逆転するため注意)
//	public static final String UDP_SEND_QRDATA_NOTIFICATION		= "A0";		// QRデータ通知
//	public static final String UDP_RECEIVE_QRDATA_NOTIFICATION	= "A1";		// QRデータ通知レスポンス
//	/**
//	 * ステータス通知&要求：データ部
//	 */
//	// 中止表示指示
//	public static final String  UDP_QR_STS_BAN_NORMAL	= "00";		// 通常
//	public static final String  UDP_QR_STS_BAN_BAN   	= "01";		// 取り扱い中止表示に切替
//
//	// 待機表示
//	public static final String  UDP_QR_STS_IDLE_NORMAL	= "00";		// 通常
//	public static final String  UDP_QR_STS_IDLE_RIDE   	= "01";		// 乗車待機画面に表示切替
//	public static final String  UDP_QR_STS_IDLE_GETOFF 	= "02";		// 降車待機画面に表示切替
//
//	/**
//	 * 接客表示&要求：データ部
//	 */
//	// QR受付
//	public static final String  UDP_QR_BAN			 	= "00";		// 禁止
//	public static final String  UDP_QR_PERMISSION		= "01";		// 許可
//
//	// 表示タイムアウト
//	public static final String  UDP_QR_DISP_TIMEOUT_NONE    = "0000";	// 禁止
//	public static final String  UDP_QR_DISP_TIMEOUT_5SEC    = "0005";	// 禁止
//
//	// イルミ制御
//	public static final String  UDP_ILMI_SYOUTU		 	= "00";		// 消灯
//	public static final String  UDP_ILMI_BLUE_LIT		= "01";		// 青点灯
//	public static final String  UDP_ILMI_BLUE_BLINK		= "02";		// 青点滅
//	public static final String  UDP_ILMI_RED_LIT		= "03";		// 赤点灯
//	public static final String  UDP_ILMI_RED_BLINK		= "04";		// 赤点滅
//
//	// 発音回数
//	public static final String  UDP_QR_SOUND_COUNT_NONE = "00";     // 発音なし
//	public static final String  UDP_QR_SOUND_COUNT_ONE  = "01";     // 発音回数1回
//	public static final String  UDP_QR_SOUND_COUNT_TWO  = "02";     // 発音回数2回
//	public static final String  UDP_QR_SOUND_COUNT_YOBI = "FF";     // 発音回数予備
//
//	// 音声種別
//	public static final String  UDP_QR_KIND_BUZZER          = "00";     // ブザー(予約)
//	public static final String  UDP_QR_KIND_SOUND           = "01";     // 音声
//	public static final String  UDP_QR_KIND_BUZZER_SOUND    = "02";     // ブザー鳴動後、音声再生(予約)
//
//	// ブザー番号
//	public static final String  UDP_QR_BUZZER_NO_00         = "00";     // ブザーNo.00
//
//	// 音声番号
//	public static final String  UDP_QR_SOUND_NO_00         = "00";     // 音声No.00
//	public static final String  UDP_QR_SOUND_NO_01         = "01";     // 音声No.01
//	public static final String  UDP_QR_SOUND_NO_02         = "02";     // 音声No.02
//	public static final String  UDP_QR_SOUND_NO_03         = "03";     // 音声No.03
//	public static final String  UDP_QR_SOUND_NO_04         = "04";     // 音声No.04
//	public static final String  UDP_QR_SOUND_NO_05         = "05";     // 音声No.05
//	public static final String  UDP_QR_SOUND_NO_06         = "06";     // 音声No.06
//	public static final String  UDP_QR_SOUND_NO_07         = "07";     // 音声No.07
//	public static final String  UDP_QR_SOUND_NO_08         = "08";     // 音声No.08
//	public static final String  UDP_QR_SOUND_NO_09         = "09";     // 音声No.09
//	public static final String  UDP_QR_SOUND_NO_0A         = "0A";     // 音声No.0A
//	public static final String  UDP_QR_SOUND_NO_0B         = "0B";     // 音声No.0B
//	public static final String  UDP_QR_SOUND_NO_0C         = "0C";     // 音声No.0C
//	public static final String  UDP_QR_SOUND_NO_0D         = "0D";     // 音声No.0D
//	public static final String  UDP_QR_SOUND_NO_0E         = "0E";     // 音声No.0E
//
//	// 期限表示色
//	public static final String  UDP_QR_LIMIT_COLOR_WHITE   = "00";     // 期限表示色白
//	public static final String  UDP_QR_LIMIT_COLOR_YELLOW  = "01";     // 期限表示色黄
//	public static final String  UDP_QR_LIMIT_COLOR_RED     = "02";     // 期限表示色赤
//	public static final String  UDP_QR_LIMIT_NONE          = "FF";     // 期限非表示
//
//
//	// 期限表示券種
//	public static final String  UDP_QR_SEISAN_KIND_SF         = "00";     // SF利用
//	public static final String  UDP_QR_SEISAN_KIND_TEIKI      = "01";     // 定期券利用
//	public static final String  UDP_QR_SEISAN_KIND_TEIKI_SF   = "02";     // 定期券・SF利用
//	public static final String  UDP_QR_SEISAN_KIND_ONEDAY     = "03";     // 一日券利用
//	public static final String  UDP_QR_SEISAN_KIND_ONEDAY_SF  = "04";     // 一日券・SF利用
//	public static final String  UDP_QR_SEISAN_KIND_SP         = "05";     // 優待券利用
//	public static final String  UDP_QR_SEISAN_KIND_SP_SF      = "06";     // 優待券・SF利用
//	public static final String  UDP_QR_SEISAN_KIND_NONE       = "FF";     // 期限無表示
//
//	// 有効期限
//	public static final String  UDP_QR_LIMIT_DATE_NONE      = "000000";     // 期限表示無し
//	public static final String  UDP_QR_LIMIT_DATE_MUKIGEN   = "FFFFFF";     // 期限無期限
//
//	// 引去額、運賃、チャージ額、入金額表示
//	public static final String  UDP_QR_SEISAN_NONE          = "FFFFFF";     // 処理金額非表示
//
//	// 前回引去額表示
//	public static final String  UDP_QR_ZENAKAI_HIKISARI_NONE = "FFFFFF";     // 前回引去額非表示
//
//	// アイコン表示
//	public static final String  UDP_ICON_DISABLE        = "00";		// 非表示
//	public static final String  UDP_ICON_ENABLE         = "01";		// 表示
//
//	// メッセージ文字色
//	public static final String  UDP_MSG_COLOR_BLACK     = "00";		// 黒
//	public static final String  UDP_MSG_COLOR_RED       = "01";		// 赤
//	public static final String  UDP_MSG_COLOR_GREEN     = "02";		// 緑
//	public static final String  UDP_MSG_COLOR_YELLOW    = "03";		// 黄
//	public static final String  UDP_MSG_COLOR_BLUE      = "04";		// 青
//	public static final String  UDP_MSG_COLOR_PINK      = "05";		// ピンク
//	public static final String  UDP_MSG_COLOR_VIOLET    = "06";		// 紫
//	public static final String  UDP_MSG_COLOR_WHITE     = "07";		// 白
//	public static final String  UDP_MSG_COLOR_NONE      = "FF";		// 非表示
//
//
//	/**
//	 * Logcat用タグ
//	 */
//	public static final String TAG_UDP_CTRL				= "UdpCtrl";// UdpCtrl用のタグ
//	public static final String TAG_UDP_SEND				= "UdpSend";// UdpSend用のタグ
//	public static final String TAG_UDP_RCV				= "UdpRcv ";// UdpRcv用のタグ
//	public static final String TAG_READER				= "Reader ";// UdpRcv用のタグ
//
//	/**
//	 * UDP制御フェーズ
//	 */
//	public static final int READER_PHASE_NO_POWER_ON	= 0;	// 起動時フェーズ
//	public static final int READER_PHASE_NO_CREW_LOGIN	= 1;	// ログインフェーズ
//	public static final int READER_PHASE_NO_IDLE		= 2;	// 待機フェーズ
//
//	/**
//	 * UDP通信用その他項目定義
//	 */
//	public static final int UDP_COM_RETRY_MAX			= 5;	// リトライMAX値
//
//	public static final int UDP_COM_STX_OFFSET			= 0;	// STXオフセット位置
//	public static final int UDP_COM_DATASIZE_OFFSET		= 1;	// データサイズオフセット位置
//	public static final int UDP_COM_DATASIZESUM_OFFSET	= 3;	// データサイズSUMオフセット位置
//	public static final int UDP_COM_COMMAND_OFFSET		= 4;	// コマンドオフセット位置
//
//	/**
//	 * UDP通信用その他項目定義
//	 */
//	public static final int UDP_COM_MSG_1_MAX			= 40;	// メッセージ1MAX値
//	public static final int UDP_COM_MSG_2_MAX			= 40;	// メッセージ2MAX値
//
//	public static final int UDP_RCV_QR_DATA_DELIMITER   = 4;	// デリミタ：コマンド
//
//	public static final int UDP_RX_BUF_SIZE				= 2048;	// 受信バッファ最大データ数
//
//	/**
//	 * UDP受信データデリミタ
//	 */
//	public static final int UDP_RCV_DATA_DELIMITER_COMMAND      = 0;	// デリミタ：コマンド
//	public static final int UDP_RCV_DATA_DELIMITER_SQNO         = 1;	// デリミタ：シーケンスNo
//	public static final int UDP_RCV_DATA_DELIMITER_DATA         = 2;	// デリミタ：データ部
//	public static final int UDP_RCV_DATA_DELIMITER_MAX          = 3;	// デリミタ：MAX値
//
//	/**
//	 * VERSIONサイズ
//	 */
//	public static final int VERSION_SIZE   = 6;
//	public static final int VERSION_SUM_SIZE   = 4;
//
//	/**
//	 * HANDLER送信対象定義
//	 */
//	public static final int HANDLER_ARG_TRUE = 1;
//	public static final int HANDLER_ARG_FALSE = 0;
//	public static final int HANDLER_PORT_INFO_TRUE = 1;
//	public static final int HANDLER_PORT_INFO_FALSE = 0;
//
//	//乗降リーダ画面番号
//	public static final String DISP_KIDO = "00";                    // 起動処理中
//	public static final String DISP_COM_OK = "01";                  // QR制御部と通信確立OK
//	public static final String DISP_UPDATE = "02";                  // データ更新中
//	public static final String DISP_CREW_TOUCH = "03";              // 乗務員QRタッチ待ち
//	public static final String DISP_BAN = "04";                     // 利用禁止
//	public static final String DISP_IDLE_1 = "10";                  // 設定なし待機(均一、信用)
//	public static final String DISP_RIDE_IDLE = "11";               // 乗車モード待機
//	public static final String DISP_IDLE_2 = "12";                  // 設定なし待機(多区)
//	public static final String DISP_SYORI_KINSHI = "13";            // 処理禁止待機
//	public static final String DISP_SYUDO_SET_KAKUTEI = "14";       // 金額・区間設定待機
//	public static final String DISP_ZANGAKU_RIREKI_TOUCH = "15";    // 残額・履歴確認設定待機
//	public static final String DISP_CHARGE_NINSYO = "16";           // チャージ認証待機
//	public static final String DISP_CHARGE_EXE = "17";              // チャージ実行待機
//	public static final String DISP_UNCHIN_NASHI = "18";            // 運賃未確定設定待機
//	public static final String DISP_SYUDO_SET_SETTEI = "19";        // 手動設定操作中
//	public static final String DISP_CHARGE_SOSA = "1A";             // チャージ設定操作中
//	public static final String DISP_DOOR_HEI = "1B";                // ドア閉待機中
//	public static final String DISP_LOGOUT_GETOFF = "1C";           // ログアウト時(降車QR)
//	public static final String DISP_LOGOUT_RIDE = "1D";             // ログアウト時(乗車QR)
//	public static final String DISP_RIDE_KINSHI = "1E";             // 乗車処理禁止待機
//	public static final String DISP_CHARGE_CREW_TOUCH = "1F";       // チャージ乗務員認証待機
//	public static final String DISP_SF_SEISAN = "30";               // SF券正常精算時
//	public static final String DISP_KUKAN_IN_SEISAN = "31";         // 定期券のみ正常精算時(定期区間内、1日券区間内、優待券区間内)
//	public static final String DISP_KUKAN_GAI_SEISAN = "32";        // 定期券+SF (定期飛びつき乗り越し・１日券飛びつき乗り越し・優待券飛びつき乗り越し)(
//
//	public static final String DISP_ZANGAKU_AUTO = "33";            // 残額不足時(自動引去)
//	public static final String DISP_FUSOKU_SEISAN = "34";           // 不足分精算画面
//	public static final String DISP_ERR_ZANGAKU = "35";             // 残額不足エラー
//	public static final String DISP_ERR_OTHER = "36";               // その他エラー時
//	public static final String DISP_ZANGAKU_RIREKI_RESULT = "37";   // 残額履歴確認結果
//	public static final String DISP_CHARGE_COMPLETE = "38";         // チャージ完了
//	public static final String DISP_RIDE_COMPLETE = "39";			//	乗車完了
//
//
//	//乗降リーダ接続台数画面
//	String CONNECT_NUM_1 = "1";
//	String CONNECT_NUM_2 = "2";
//	String CONNECT_NUM_3 = "3";
//
//
//	//乗降リーダ　QR受付
//	String QR_PROHIBIT = "00";
//	String QR_ALLOW = "01";
//
//	//乗降リーダ　イルミ制御
//	String ILL_NONE = "00";
//	String ILL_BLUE = "01";
//	String ILL_BLUE_FLASH = "02";
//	String ILL_RED = "03";
//	String ILL_RED_FLASH = "04";
//
//	//乗降リーダ音声種別
//	String BUZZER = "00";
//	String VOICE = "01";
//	String BUZZER_VOICE = "02";
//
//	//乗降リーダ期限表示色
//	String LIMIT_WHITE = "00";
//	String LIMIT_YELLOW = "01";
//	String LIMIT_RED = "02";
//
//	//乗降リーダ期限表示券種
//	String USE_SF = "00";
//	String USE_TEIKI = "01";
//	String USE_TEIKI_SF = "02";
//	String USE_DAY = "03";
//	String USE_DAY_SF = "04";
//	String USE_YUTAI = "05";
//	String USE_YUUTAI_SF = "06";
//
//	//乗降リーダメッセージ表示色
//	String MESSAGE_BLACK = "00";
//	String MESSAGE_RED = "01";
//	String MESSAGE_GREEN = "02";
//	String MESSAGE_YELLOW = "03";
//	String MESSAGE_BLUE = "04";
//	String MESSAGE_PINK = "05";
//	String MESSAGE_PURPLE = "06";
//	String MESSAGE_WHITE = "07";
//
//	//運行モード
//	int TAKU = 1;
//	int KINITSU = 2;
//	int SINYO = 3;
//	int SINYA_KYUKOU = 4;
//
//	int INIT_SECTION_SET_NO = 0;
//
//	int AMOUNT_SET_MAX  = 65535;
//	int AMOUNT_SET_MIN  = 0;
//	int SECTION_SET_MAX = 99;
//	int SECTION_SET_MIN = 0;
//	int BACKLIGHT_MAX = 255;
//	int BACK_LIGHT_MIN = 0;
//	int OFFICE_NUM_MAX = 255;
//	int OFFICE_NUM_MIN = 0;
//	int QR_BRIGHTNESS_MAX = 255;
//	int QR_BRIGHTNESS_MIN = 0;
//	int READER_BRIGHTNESS_MAX = 255;
//	int READER_BRIGHTNESS_MIN = 0;
//	int SEQUENCE_NUM_MAX = 9999;
//	int SEQUENCE_NUM_MIN = 0;
//	int VEHICLE_NUM_MAX = 9999;
//	int VEHICLE_NUM_MIN = 0;
//	int VOLUME_MAX = 15;
//	int VOLUME_MIN = 0;
//	int LOGIN_PASSWORD_MIN = 0;
//	int LOGIN_PASSWORD_MAX = 99999999;
//	int USER_CODE_MIN = 0;
//	int USER_CODE_MAX = 255;
//	int PAY_TIME_MIN = 0;
//	int PAT_TIME_MAX = 99;
//
//	// ---------- NEW ------//
//	int ROUTE_ID_MIN = 0;
//	int ROUTE_ID_MAX = 9999;
//	 int STOP_SEQUENCE_MIN = 0;
//	 int STOP_SEQUENCE_MAX = 99;
//	 int CONTROLLER_ID_MIN = 0;
//	 int CONTROLLER_ID_MAX = 99;
//	 int READER_VOLUME_MIN = 0;
//	 int READER_VOLUME_MAX = 99;
//	// ---------- END ------//
//	int VEHICLE_DIGIT = 4;
//
//	int LOGIN_PASSWORD_DIGIT = 8;
//
//	//VERSION用ID
//	///----------------------- OLD -----------------//
//	public static final int VER_ID_QR_CTRL = 0;
//	public static final int VER_ID_QR_GET_OFF = 1;
//	public static final int VER_ID_QR_RIDE1 = 2;
//	public static final int VER_ID_QR_RIDE2 = 3;
//	public static final int VER_ID_QR_RIDE3 = 4;
//	public static final int VER_ID_QR_RIDE4 = 5;
//	public static final int VER_ID_QR_LIVU = 6;
//	public static final int VER_ID_QR_OBC = 7;
//	///----------------------- NEW -----------------//
//	 int VER_ID_MANAGE_APP = 0;
//	 int VER_ID_SYSTEM_APP = 1;
//	 int VER_ID_OS = 2;
//	 int VER_ID_MESSENGER_MASTER = 3;
//	 int VER_ID_NAME_MASTER = 4;
//	 int VER_ID_VEHICLE_DEVICE_SETTING = 5;
//	 int VER_ID_OPERATOR_VEHICLE_DEVICE_SETTING = 6;
//	 int VER_ID_FARE_MASTER = 7;
//	 int VER_ID_READER_APP = 8;
//	///----------------------- END -----------------//
//
//
//	public static final long MAX_SEND_COUNT = 100000000;
//
//	//データ型
//	int STR_TYPE = 0;
//	int INT_TYPE = 1;
//
//	//ドア信号検出レベル
//	String LO = "0";
//	String HI = "1";
//
//	//初期設定値
//	//QR制御部設定
//	 // ------------------- OLD ------------//
//	int SPECIAL_FARE_1_AMOUNT_INI = 50;
//	int SPECIAL_FARE_2_AMOUNT_INI = 100;
//	String LOGIN_PASSWORD_INI = "00000000";
//	String USER_CODE_INI = "FF";
//	int OFFICE_NUM_INI = 255;
//	int READER_NUM_INI = 2;
//	int QR_BRIGHTNESS_INI = 0;
//	int QR_DOOR_DETECT_LV_INI = 1;
//	int BACKLIGHT_TIME_INI = 0;
//	 // ------------------- NEW ------------//
//	 //TODO: 最初値をチェック
//	 int CONTROLLER_ID_INI = 0;
//	 int READER_VOLUME_1_INI = 0;
//	 int READER_VOLUME_2_INI = 0;
//	 int READER_VOLUME_3_INI = 0;
//	 int READER_VOLUME_4_INI = 0;
//	 int VEHICLE_TYPE_INT = 1;
//	 // ------------------- END ------------//
//	//リーダ設定
//	int PAY_RESULT_DISP_TIME_INI = 5;
//	int READER_BRIGHTNESS_INI = 0;
//	int READER_DOOR_DETECT_LV_INI = 1;
//	int SOUND_VOLUME_INI = 10;
//	//車両設定
//	String VEHICLE_NUM_INI = "9999";
//	String SEQUENCE_NUM_INI = "9999";
//
//	int LONG_TYPE = 2;
//	/******************************************************/
//	/***                  QR CODE                        **/
//	/******************************************************/
//	/*** Debug ***/
//	int DEBUG_QR_SIZE = 768;
//	int DEBUG_QR_SUM_SIZE = 4;
//
//	/*** LPQR1 ***/
//	byte LPQR1_FORMAT_TAG = (byte)0x85;
//	int LPQR1_FORMAT_TAG_SIZE = 5;
//	byte LPQR1_DATA_TAG = (byte)0x61;
//	int LPQR1_DATA_LENGTH_SIZE = 3;
//	byte LPQR1_COMPANY_CODE_TAG = 0x4F;
//	int LPQR1_COMPANY_CODE_TAG_SIZE = 4;
//	byte LPQR1_EXPIRATION_TAG = 0x57;
//	int LPQR1_EXPIRATION_TAG_SIZE = 15;
//	int LPQR1_EXPIPATION_TAG_PREFIX_SIZE = 8;
//	int LPQR1_EXPIPATION_TAG_EXPIPATION_SIZE = 7;
//	byte LPQR1_QR_DATA_TAG = (byte)0x99;
//
//	/*************************************************************/
//	/*************************AWS*********************************/
//	/*************************************************************/
//	int AWS_REGISTED = 0;
//	int AWS_NOT_REGIST = 1;
//	int AWS_REGIST_SUCCESS = 2;
//	int AWS_REGIST_FAILED = 3;
//
//	//精算方法
//	int NONE = 0;
//	int UPPER_TRANSACTION_FINISH = 100;
//	int LOWER_TRANSACTION_FINISH = 101;
//
//	int LDMS_BASE_ALLAY_SIZE = 8;
//
//	//マスタのデータサイズ
//	//ヘッダ部のデータサイズ
//	int INHEADER_DATA_SIZE = 0x200;
//	//車載設定データ部のデータサイズ
//	int CLSETTING_DATA_SIZE = 0x400;
//	//マスタセットのデータサイズ
//	int MASTER_SET_DATA_SIZE = 0x7600;
//
//
//	int SEISAN = 110;
//
//	//処理コード
//	//TODO:地域連携の操作部IF仕様書から抜粋した。不足する処理コードは適宜補うこと。
//	String PROCESS_STS_PAY = "00"; 			//SF精算
//	String PROCESS_STS_TEIKI_DAY = "10";	//区間内定期精算(昼)
//	String PROCESS_STS_TEIKI_MIDNIGHT = "17";//区間内定期精算(深夜)
//	String PROCESS_STS_NORIKOSHI_DAY = "80";//乗り越し、飛びつき精算(昼)
//	String PROCESS_STS_NORIKOSHI_MIDNIGHT = "85";//乗り越し、飛びつき精算(深夜)
//
//	//汎用パラメータのインデックス
//	int PROCESS_CODE_INDEX = 0x68;		//処理コードのインデックス
//	int TICKET_NO_INDEX = 0x34;			//整理券番号のインデックス
//	int TRANSACTION_AMOUNT_INDEX = 0x4D;	//精算金額(処理金額のインデックス)
//	int TICKET_KIND_INDEX = 0x73;		//券種のインデックス
//	int BEFORE_BALANCE_INDEX = 0x4A;
//	int BALANCE_INDEX = 0x50;			//残額のインデックス
//	int TEIKI_END_INDEX = 0x58;			//定期有効期限のインデックス
//	int PASSENGER_NUM_INDEX = 0x46;		//精算人数のインデックス
//	int SHORT_AMOUNT_INDEX = 0x20;		//不足額のインデックス
//	int SHORT_FARE_INDEX = 0x23;
//
//	//ErrCode
//	 int SHORT_BALANCE_ERR = -4400;
//
//	 //マスタファイルのサイズ
//	 int JOSYA_MASTER_SIZE = 0x100;
//
//}
