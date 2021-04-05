/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.util.HashMap;

/**
 *
 * @author bason
 */
public class Constanta {
    public class Messages{

        public static final String MEESAGE_REGISTER_SUCESS = "Register success!";
        public static final String MESSAGE_SUCCESS = "Success !";
        public static final String MESSAGE_FAILED = "Failed !";
        public static final String MESSAGE_FAILED_LOGIN = "Username or Password is not match!";
        public static final String MESSAGE_ERROR = "Error : ";
        public static final String MESSAGE_INVALID = "Please fill all required data !";
        public static final String MESSAGE_CONFIRM_LOGOUT = "Are you sure to logout?";
        public static final String MESSAGE_CONFIRM_DELETE = "Are you sure to delete this records?";
        public static final String BANNER_CONFIRM = "Confirmation";
    }
    
    public static class Status {
        public HashMap<String, Integer> populateComboBox() {
            HashMap<String, Integer> result = new HashMap<>();
            
            result.put("Active", 1);
            result.put("Inactive", 2);
            
            return result;
        }
    }
    
    public static class Education {
        public HashMap<String, Integer> populateComboBox() {
            HashMap<String, Integer> result = new HashMap<>();
            
            result.put("Sekolah Dasar", 1);
            result.put("Sekolah Menengah Pertama", 2);
            result.put("Sekolah Menengah Atas", 3);
            result.put("Diploma", 4);
            result.put("Sarjana", 5);
            result.put("Magister", 6);
            result.put("Doktoral", 7);
            
            return result;
        }
    }
    
    public class Default{
        public static final String DEFAULT_VALUE = "[%DEFAULT%]";
        public static final String BUTTON_ADD = "Save";
        public static final String BUTTON_UPDATE = "Update";
    }
}