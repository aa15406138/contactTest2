package com.example.contacttest2;

import android.R.integer;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public  class MyProvider extends ContentProvider{

	//this is test
	//this is test2
	//this is test3 
	public static final int TABLE1_DIR1 = 0;
	public static final int TABLE1_ITEM = 1;
	public static final int TABLE2_DIR = 2;
	public static final int TABLE2_ITEM = 3;
	private static UriMatcher uriMatcher;
	static {
		
		uriMatcher =  new UriMatcher(UriMatcher.NO_MATCH);
		uriMatcher.addURI("com.example.app.prvider", "table1",TABLE1_DIR1);
		uriMatcher.addURI("com.example.app.prvider", "table1/#",TABLE1_ITEM);
		uriMatcher.addURI("com.example.app.prvider", "table2/",TABLE2_DIR);
		uriMatcher.addURI("com.example.app.prvider", "table2/#",TABLE2_ITEM);
	}
	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType(Uri uri) {
		// TODO Auto-generated method stub
		switch(uriMatcher.match(uri))
		{
		case TABLE1_DIR1:
			return "vnd.android.cursor.dir/vnd.com.example.app.provider.table1";
		case TABLE1_ITEM:
			return "vnd.android.cursor.item/vnd.com.example.app.provider.table1";
		case TABLE2_DIR:
			return "vnd.android.cursor.dir/vnd.com.example.app.provider.table2";
		case TABLE2_ITEM:
			return "vnd.android.cursor.item/vnd.com.example.app.provider.table2";
			default:
				break;
		}
		return null;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean onCreate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		// TODO Auto-generated method stub
		switch(uriMatcher.match(uri))
		{
		case TABLE1_DIR1:
			//查询table1表中的所有数据
			break;
		case TABLE1_ITEM:
			//查询table1表中的单条数据
			break;
		case TABLE2_DIR:
			//查询table2表中的所有数据
			break;
		case TABLE2_ITEM:
			//查询table2表中的单条数据
			break;
			default:
				break;
		}
		return null;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}

}
