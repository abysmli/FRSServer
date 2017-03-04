package frs.server.controller;

import java.sql.SQLException;

import javax.naming.NamingException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import frs.server.model.SymptomDatabaseHandler;

public class UserController {
	private SymptomDatabaseHandler database = new SymptomDatabaseHandler();

	public JSONObject getUser(String username, String password) throws NamingException, SQLException, JSONException {
		JSONObject obj = database.getUser(username);
		if (obj.getString("password").equals(password)) {
			obj.put("status", "success");
		} else {
			obj.put("status", "wrong");
		}
		return obj;
	}

	// TODO: implements later
	public int delUser(String username) {
		return 0;

	}

	// TODO: implements later
	public int addUser(JSONObject user) {
		return 0;

	}

	// TODO: implements later
	public int updateUser(String username) {
		return 0;
	}

	// TODO: implements later
	public JSONArray getAllUsers() {
		return null;

	}
}