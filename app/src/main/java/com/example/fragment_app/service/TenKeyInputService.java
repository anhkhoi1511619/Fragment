//package com.example.fragment_app.service;
//
//import android.widget.TextView;
//
//import jp.co.lecip.manager.TenKeyManager;
//
//public class TenKeyInputService {
//	private static TenKeyManager tenKeyManager;
//
//	/**
//	 * 概要："テンキー"を押下した際の処理
//	 * @param tkm:テンキーマネージャのインスタンス
//	 */
//	public void setTenKeyManager(TenKeyManager tkm){
//		tenKeyManager = tkm;
//	}
//
//	/**
//	 * 概要：0～9キーを押下した際の処理
//	 * @param key:入力した0～9キー
//	 */
//	public void inputTenKey(int key){
//		String inputkey = tenKeyManager.inputKey(key);
//		TextView tv = tenKeyManager.getTextView();
//
//		if(tv != null) {
//			tv.setText(inputkey);
//		}
//	}
//
//	/**
//	 * 概要："AC"ボタン押下した際の処理
//	 */
//	public void inputAcKey(){
//		tenKeyManager.inputAcKey();
//	}
//
//	/**
//	 * 概要："確定"ボタン押下した際の処理
//	 */
//	public void inputDecideKey(){
//		tenKeyManager.inputDecideKey();
//	}
//}
