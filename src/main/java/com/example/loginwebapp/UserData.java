package com.example.loginwebapp;

import java.util.*;

public class UserData {
	
private static HashMap<String, UserModel> userModels = new HashMap<>();
private static HashMap<String, AddressModel> addressModels = new HashMap<>();
	
	static {
		
		UserModel defaultUserData = new UserModel("test", "1", "test@gmail.com", "1234", "Male");
		
		userModels.put(defaultUserData.getEmail(), defaultUserData);
	}
	
	public static boolean emailExists(String email) {
		
		return userModels.containsKey(email);
	}
	
	public static void registerNewUser(UserModel userModel) {
		
		userModels.put(userModel.getEmail(), userModel);
	}
	
	public static UserModel getUser(String email) {
		
		return userModels.get(email);
	}
	
	public static void updateNewPassword(String email, String newPassword) {
		
		if (userModels.containsKey(email)) {
			
			userModels.get(email).setPassword(newPassword);
		}
	}
	
	public static void saveAddress( String email, AddressModel addressModel) {
		
		addressModels.put(email, addressModel);
		
	}
	
	public static AddressModel getAddress(String email) {
		
		return addressModels.get(email);
	}

}
