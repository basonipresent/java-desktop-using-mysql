/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.util.HashMap;

/**
 *
 *  
 */
public class Constanta {
    public class Messages{

        public static final String MEESAGE_REGISTER_SUCESS = "Register success!";
        public static final String MESSAGE_SUCCESS = "Success !";
        public static final String MESSAGE_FAILED = "Failed !";
        public static final String MESSAGE_FAILED_LOGIN = "Username or Password is not match!";
        public static final String MESSAGE_ERROR = "Error : ";
        public static final String MESSAGE_INVALID = "Please fill all required data !";
        public static final String MESSAGE_INVALID_REGISTER = "Username is not valid !\n Please, contact administrator";
        public static final String MESSAGE_CONFIRM_LOGOUT = "Are you sure to logout?";
        public static final String MESSAGE_CONFIRM_DELETE = "Are you sure to delete this records?";
        public static final String BANNER_CONFIRM = "Confirmation";
        public static final String MESSAGE_ALREADY_CHECKIN = "Please check out your attendance before !";
        public static final String MESSAGE_ALREADY_CHECKOUT = "Please check in before your check out !";
    }
    
    public static class Status {
        public static final String ACTIVE = "ACTIVE";
        public static final String INACTIVE = "INACTIVE";
        public HashMap<String, Integer> populateComboBox() {
            HashMap<String, Integer> result = new HashMap<>();
            
            result.put(ACTIVE, 1);
            result.put(INACTIVE, 2);
            
            return result;
        }
    }
    
    public static class Education {
        public HashMap<String, Integer> populateComboBox() {
            HashMap<String, Integer> result = new HashMap<>();
            
            result.put("Sekolah Menengah Pertama", 1);
            result.put("Sekolah Menengah Atas", 2);
            result.put("Diploma", 3);
            result.put("Sarjana", 4);
            
            return result;
        }
    }
    
    public class Default{
        public static final String DEFAULT_VALUE = "[%DEFAULT%]";
        public static final int DEFAULT_NUMERIC_VALUE = 0;
        public static final String DEFAULT_LOCATION = "OFFICE";
        public static final String DEFAULT_CHECKIN_STATUS = "CHECK IN";
        public static final String DEFAULT_CHECKOUT_STATUS = "CHECK OUT";
        public static final String DEFAULT_CHECKIN_INFORMATION = "Check In by %s at %s in %s";
        public static final String DEFAULT_CHECKOUT_INFORMATION = "Check Out by %s at %s in %s with duration of working : %s";
        
        public static final String BUTTON_ADD = "Save";
        public static final String BUTTON_UPDATE = "Update";
    }
    
    public class Role{
        public static final int ADMINISTRATOR = 1;
        public static final int HRD = 2;
        public static final int GENERAL = 3;
    }
    
    public class Leave{
        public static final String DRAF = "DRAF";
        public static final String SUBMIT = "SUBMIT";
        public static final String APPROVED = "APPROVED";
        public static final String REJECTED = "REJECTED";
    }
    
    public class PdfDocument{
        public static final int WIDTH_PERCENTAGE = 100;
        public static final float SPACING_BEFORE = 10f;
        public static final float SPACING_AFTER = 10f;
        public static final String PATH = "D:\\dev\\.project\\ecms\\docs\\";
        public static final String DOCUMENT_TITLE_ATTENDANCE = "Report Attendance";
        public static final String DOCUMENT_TITLE_PAYSLIP = "Report Payslip";
        public static final String DOCUMENT_TITLE_LEAVE = "Report Leave";
        public static final String DOCUMENT_CREATOR = "Employee Content Management System";
        public static final String DOCUMENT_AUTHOR = "Employee Content Management System";
    }
}
