package com.example.kj.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by KJ on 10/8/15.
 */
public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;



    private CrimeLab(Context context){ //CONSTRUCTOR
        mCrimes = new ArrayList<>();
    }

    public void addCrime(Crime c){
        mCrimes.add(c);
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }


    public Crime getCrime(UUID id){
        for (Crime crime: mCrimes){
            if(crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }


    public static CrimeLab get(Context context) {

        if(sCrimeLab ==null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }



}
