package com.todd.zannivfrontend.utils;

import android.content.Context;

import com.todd.zannivfrontend.models.User;

import org.json.JSONException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Util {

    private static final String PREF_FILE = "pref_file";
    private static final String USER = "user";

    public static void setUser(Context context, String json) {

        // TODO : sauvegarder
    }

    public static User getUser(Context context) throws JSONException, ParseException {
        // TODO : restaurer
        return null;
    }

    public static boolean isUserNameValid(String userName) {
        if (userName.trim().length() < 2 || userName.trim().length() > 255 ) {
            return false;
        }
        return true;
    }

    public static boolean isPasswordValid(String password) {
        // TOEVOL ajouter autres conditions
        if (password.length() < 7) {
            return false;
        }
       return true;
    }

    public static String printDate(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.FRENCH);
        return dateFormat.format(date);
    }

    public static Date initDateFromDB(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        try {
            return format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

}
