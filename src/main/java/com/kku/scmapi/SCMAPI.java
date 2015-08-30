package com.kku.scmapi;

public class SCMAPI {

	public ResponseStatus processCredStandard(RequestParameter reqParam) {
		ResponseStatus res = new ResponseStatus();
		res.setCredValue(0.8);
		return res;
	}

	public ResponseStatus processCredCustom(RequestParameter reqParam) {
		ResponseStatus res = new ResponseStatus();
		res.setCredValue(0.8);
		return res;
	}

	public static void main(String[] args) {
		RequestParameter req = new RequestParameter();
		req.setSocialMediaType("facebook");
		req.setMessage("Social content message");

		SCMAPI api = new SCMAPI();
		ResponseStatus res = api.processCredStandard(req);
		double credValue = res.getCredValue();
		System.out.println(credValue);
	}

}
