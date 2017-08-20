package com.example.srikanth.sampleapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Srikanth on 19/08/2017.
 */

public class JsonModel {

        @SerializedName("contacts")
        @Expose
        private ArrayList<jsonData> list = new ArrayList<>();

        /**
         *
         */
        public ArrayList<jsonData> getContacts() {
            return list;
        }

        /**

         */
        public void setContacts(ArrayList<jsonData> list) {
            this.list = list;
        }
    }

