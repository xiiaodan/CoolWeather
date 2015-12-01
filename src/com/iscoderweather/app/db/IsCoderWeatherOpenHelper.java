package com.iscoderweather.app.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class IsCoderWeatherOpenHelper extends SQLiteOpenHelper {
	
	/**
	 * Province���������
	 */
	public static final String CREATE_PROVINCE = "create table Province ("
			+ "id integer primary key autoincrement,"
			+ "province_name text,"
			+ "province_code text)";
	
	/**
	 * City���������
	 */
	public static final String CREATE_CITY = "create table city ("
			+ "id integer primary key autoincrement,"
			+ "city_name text,"
			+ "city_code text,"
			+ "province_id integer)";
	
	/**
	 * County���������
	 */
	public static final String CREATE_COUNTY = "create table county("
			+ "id integer primary key autoincrement"
			+ "county_name text"
			+ "county_code text"
			+ "city_id integer)";
	
	public IsCoderWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_CITY);//����City��
		db.execSQL(CREATE_COUNTY);//����County��
		db.execSQL(CREATE_PROVINCE);//����Province��
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}