package com.andrew.mycloset;

import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

import android.graphics.Bitmap;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class clothingEntity extends GenericJson {
	@Key
	private String nfc_id;
	@Key
	private String c_type;
	@Key
	private String imageURL;
	
	private Bitmap image;
	
	public String get_id() {
		return nfc_id;
	}
	public void set_id(String nfc_id) {
		this.nfc_id = nfc_id;
	}
	public String get_type() {
		return c_type;
	}
	public void set_type(String c_type) {
		this.c_type = c_type;
	}
	public String get_imageURL() {
		return imageURL;
	}
	public void set_imageURL(String imageURL) {
		this.imageURL = imageURL;
	}
}

