package de.eurocoinsalbum.model;

import java.util.ArrayList;

import de.eurocoinsalbum.R;
import de.eurocoinsalbum.util.CoinHelper;

public class CoinDatabase {
    public static final String VATICAN_2005_SPECIAL_TITLE = "X";
    public static final String GREECE_2002_SPECIAL_TITLE = "X";

    public static void add2EuroCommemorativeCoins(Database database) {
        // public ArrayList<SpecialEuroCoin> add2EuroCoin(String countryCode, String coinTitleID, int year, int imgResId, int imgResIdLightend, int titleResId, int descResId, int volumeResId, int dateResId, int abrevationResId, int shortTitleResId)
        database.add2EuroCoin("gr", SpecialEuroCoin.COMMON_TITLE_2CC, 2004, R.drawable.twoeuro_comm_2004_gr, R.drawable.twoeuro_comm_2004_gr_lightend, R.string.twoeuro_comm_2004_gr_title, R.string.twoeuro_comm_2004_gr_desc, R.string.twoeuro_comm_2004_gr_volume, R.string.twoeuro_comm_2004_gr_date, R.string.twoeuro_comm_2004_gr_abr, R.string.twoeuro_comm_2004_gr_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2004, R.drawable.twoeuro_comm_2004_fi, R.drawable.twoeuro_comm_2004_fi_lightend, R.string.twoeuro_comm_2004_fi_title, R.string.twoeuro_comm_2004_fi_desc, R.string.twoeuro_comm_2004_fi_volume, R.string.twoeuro_comm_2004_fi_date, R.string.twoeuro_comm_2004_fi_abr, R.string.twoeuro_comm_2004_fi_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC, 2004, R.drawable.twoeuro_comm_2004_it, R.drawable.twoeuro_comm_2004_it_lightend, R.string.twoeuro_comm_2004_it_title, R.string.twoeuro_comm_2004_it_desc, R.string.twoeuro_comm_2004_it_volume, R.string.twoeuro_comm_2004_it_date, R.string.twoeuro_comm_2004_it_abr, R.string.twoeuro_comm_2004_it_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2004, R.drawable.twoeuro_comm_2004_lu, R.drawable.twoeuro_comm_2004_lu_lightend, R.string.twoeuro_comm_2004_lu_title, R.string.twoeuro_comm_2004_lu_desc, R.string.twoeuro_comm_2004_lu_volume, R.string.twoeuro_comm_2004_lu_date, R.string.twoeuro_comm_2004_lu_abr, R.string.twoeuro_comm_2004_lu_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC, 2004, R.drawable.twoeuro_comm_2004_sm, R.drawable.twoeuro_comm_2004_sm_lightend, R.string.twoeuro_comm_2004_sm_title, R.string.twoeuro_comm_2004_sm_desc, R.string.twoeuro_comm_2004_sm_volume, R.string.twoeuro_comm_2004_sm_date, R.string.twoeuro_comm_2004_sm_abr, R.string.twoeuro_comm_2004_sm_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC, 2004, R.drawable.twoeuro_comm_2004_va, R.drawable.twoeuro_comm_2004_va_lightend, R.string.twoeuro_comm_2004_va_title, R.string.twoeuro_comm_2004_va_desc, R.string.twoeuro_comm_2004_va_volume, R.string.twoeuro_comm_2004_va_date, R.string.twoeuro_comm_2004_va_abr, R.string.twoeuro_comm_2004_va_short_title);
        database.add2EuroCoin("au", SpecialEuroCoin.COMMON_TITLE_2CC, 2005, R.drawable.twoeuro_comm_2005_au, R.drawable.twoeuro_comm_2005_au_lightend, R.string.twoeuro_comm_2005_au_title, R.string.twoeuro_comm_2005_au_desc, R.string.twoeuro_comm_2005_au_volume, R.string.twoeuro_comm_2005_au_date, R.string.twoeuro_comm_2005_au_abr, R.string.twoeuro_comm_2005_au_short_title);
        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC, 2005, R.drawable.twoeuro_comm_2005_be, R.drawable.twoeuro_comm_2005_be_lightend, R.string.twoeuro_comm_2005_be_title, R.string.twoeuro_comm_2005_be_desc, R.string.twoeuro_comm_2005_be_volume, R.string.twoeuro_comm_2005_be_date, R.string.twoeuro_comm_2005_be_abr, R.string.twoeuro_comm_2005_be_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2005, R.drawable.twoeuro_comm_2005_fi, R.drawable.twoeuro_comm_2005_fi_lightend, R.string.twoeuro_comm_2005_fi_title, R.string.twoeuro_comm_2005_fi_desc, R.string.twoeuro_comm_2005_fi_volume, R.string.twoeuro_comm_2005_fi_date, R.string.twoeuro_comm_2005_fi_abr, R.string.twoeuro_comm_2005_fi_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC, 2005, R.drawable.twoeuro_comm_2005_it, R.drawable.twoeuro_comm_2005_it_lightend, R.string.twoeuro_comm_2005_it_title, R.string.twoeuro_comm_2005_it_desc, R.string.twoeuro_comm_2005_it_volume, R.string.twoeuro_comm_2005_it_date, R.string.twoeuro_comm_2005_it_abr, R.string.twoeuro_comm_2005_it_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2005, R.drawable.twoeuro_comm_2005_lu, R.drawable.twoeuro_comm_2005_lu_lightend, R.string.twoeuro_comm_2005_lu_title, R.string.twoeuro_comm_2005_lu_desc, R.string.twoeuro_comm_2005_lu_volume, R.string.twoeuro_comm_2005_lu_date, R.string.twoeuro_comm_2005_lu_abr, R.string.twoeuro_comm_2005_lu_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC, 2005, R.drawable.twoeuro_comm_2005_sm, R.drawable.twoeuro_comm_2005_sm_lightend, R.string.twoeuro_comm_2005_sm_title, R.string.twoeuro_comm_2005_sm_desc, R.string.twoeuro_comm_2005_sm_volume, R.string.twoeuro_comm_2005_sm_date, R.string.twoeuro_comm_2005_sm_abr, R.string.twoeuro_comm_2005_sm_short_title);
        database.add2EuroCoin("es", SpecialEuroCoin.COMMON_TITLE_2CC, 2005, R.drawable.twoeuro_comm_2005_sp, R.drawable.twoeuro_comm_2005_sp_lightend, R.string.twoeuro_comm_2005_es_title, R.string.twoeuro_comm_2005_es_desc, R.string.twoeuro_comm_2005_es_volume, R.string.twoeuro_comm_2005_es_date, R.string.twoeuro_comm_2005_es_abr, R.string.twoeuro_comm_2005_es_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC, 2005, R.drawable.twoeuro_comm_2005_va, R.drawable.twoeuro_comm_2005_va_lightend, R.string.twoeuro_comm_2005_va_title, R.string.twoeuro_comm_2005_va_desc, R.string.twoeuro_comm_2005_va_volume, R.string.twoeuro_comm_2005_va_date, R.string.twoeuro_comm_2005_va_abr, R.string.twoeuro_comm_2005_va_short_title);
        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC, 2006, R.drawable.twoeuro_comm_2006_be, R.drawable.twoeuro_comm_2006_be_lightend, R.string.twoeuro_comm_2006_be_title, R.string.twoeuro_comm_2006_be_desc, R.string.twoeuro_comm_2006_be_volume, R.string.twoeuro_comm_2006_be_date, R.string.twoeuro_comm_2006_be_abr, R.string.twoeuro_comm_2006_be_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC, 2006, R.drawable.twoeuro_comm_2006_de, R.drawable.twoeuro_comm_2006_de_lightend, R.string.twoeuro_comm_2006_de_title, R.string.twoeuro_comm_2006_de_desc, R.string.twoeuro_comm_2006_de_volume, R.string.twoeuro_comm_2006_de_date, R.string.twoeuro_comm_2006_de_abr, R.string.twoeuro_comm_2006_de_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2006, R.drawable.twoeuro_comm_2006_fi, R.drawable.twoeuro_comm_2006_fi_lightend, R.string.twoeuro_comm_2006_fi_title, R.string.twoeuro_comm_2006_fi_desc, R.string.twoeuro_comm_2006_fi_volume, R.string.twoeuro_comm_2006_fi_date, R.string.twoeuro_comm_2006_fi_abr, R.string.twoeuro_comm_2006_fi_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC, 2006, R.drawable.twoeuro_comm_2006_it, R.drawable.twoeuro_comm_2006_it_lightend, R.string.twoeuro_comm_2006_it_title, R.string.twoeuro_comm_2006_it_desc, R.string.twoeuro_comm_2006_it_volume, R.string.twoeuro_comm_2006_it_date, R.string.twoeuro_comm_2006_it_abr, R.string.twoeuro_comm_2006_it_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2006, R.drawable.twoeuro_comm_2006_lu, R.drawable.twoeuro_comm_2006_lu_lightend, R.string.twoeuro_comm_2006_lu_title, R.string.twoeuro_comm_2006_lu_desc, R.string.twoeuro_comm_2006_lu_volume, R.string.twoeuro_comm_2006_lu_date, R.string.twoeuro_comm_2006_lu_abr, R.string.twoeuro_comm_2006_lu_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC, 2006, R.drawable.twoeuro_comm_2006_sm, R.drawable.twoeuro_comm_2006_sm_lightend, R.string.twoeuro_comm_2006_sm_title, R.string.twoeuro_comm_2006_sm_desc, R.string.twoeuro_comm_2006_sm_volume, R.string.twoeuro_comm_2006_sm_date, R.string.twoeuro_comm_2006_sm_abr, R.string.twoeuro_comm_2006_sm_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC, 2006, R.drawable.twoeuro_comm_2006_va, R.drawable.twoeuro_comm_2006_va_lightend, R.string.twoeuro_comm_2006_va_title, R.string.twoeuro_comm_2006_va_desc, R.string.twoeuro_comm_2006_va_volume, R.string.twoeuro_comm_2006_va_date, R.string.twoeuro_comm_2006_va_abr, R.string.twoeuro_comm_2006_va_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC, 2007, R.drawable.twoeuro_comm_2007_de, R.drawable.twoeuro_comm_2007_de_lightend, R.string.twoeuro_comm_2007_de_title, R.string.twoeuro_comm_2007_de_desc, R.string.twoeuro_comm_2007_de_volume, R.string.twoeuro_comm_2007_de_date, R.string.twoeuro_comm_2007_de_abr, R.string.twoeuro_comm_2007_de_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2007, R.drawable.twoeuro_comm_2007_fi, R.drawable.twoeuro_comm_2007_fi_lightend, R.string.twoeuro_comm_2007_fi_title, R.string.twoeuro_comm_2007_fi_desc, R.string.twoeuro_comm_2007_fi_volume, R.string.twoeuro_comm_2007_fi_date, R.string.twoeuro_comm_2007_fi_abr, R.string.twoeuro_comm_2007_fi_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2007, R.drawable.twoeuro_comm_2007_lu, R.drawable.twoeuro_comm_2007_lu_lightend, R.string.twoeuro_comm_2007_lu_title, R.string.twoeuro_comm_2007_lu_desc, R.string.twoeuro_comm_2007_lu_volume, R.string.twoeuro_comm_2007_lu_date, R.string.twoeuro_comm_2007_lu_abr, R.string.twoeuro_comm_2007_lu_short_title);
        database.add2EuroCoin("mc", SpecialEuroCoin.COMMON_TITLE_2CC, 2007, R.drawable.twoeuro_comm_2007_mc, R.drawable.twoeuro_comm_2007_mc_lightend, R.string.twoeuro_comm_2007_mc_title, R.string.twoeuro_comm_2007_mc_desc, R.string.twoeuro_comm_2007_mc_volume, R.string.twoeuro_comm_2007_mc_date, R.string.twoeuro_comm_2007_mc_abr, R.string.twoeuro_comm_2007_mc_short_title);
        database.add2EuroCoin("po", SpecialEuroCoin.COMMON_TITLE_2CC, 2007, R.drawable.twoeuro_comm_2007_po, R.drawable.twoeuro_comm_2007_po_lightend, R.string.twoeuro_comm_2007_po_title, R.string.twoeuro_comm_2007_po_desc, R.string.twoeuro_comm_2007_po_volume, R.string.twoeuro_comm_2007_po_date, R.string.twoeuro_comm_2007_po_abr, R.string.twoeuro_comm_2007_po_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC, 2007, R.drawable.twoeuro_comm_2007_sm, R.drawable.twoeuro_comm_2007_sm_lightend, R.string.twoeuro_comm_2007_sm_title, R.string.twoeuro_comm_2007_sm_desc, R.string.twoeuro_comm_2007_sm_volume, R.string.twoeuro_comm_2007_sm_date, R.string.twoeuro_comm_2007_sm_abr, R.string.twoeuro_comm_2007_sm_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC, 2007, R.drawable.twoeuro_comm_2007_va, R.drawable.twoeuro_comm_2007_va_lightend, R.string.twoeuro_comm_2007_va_title, R.string.twoeuro_comm_2007_va_desc, R.string.twoeuro_comm_2007_va_volume, R.string.twoeuro_comm_2007_va_date, R.string.twoeuro_comm_2007_va_abr, R.string.twoeuro_comm_2007_va_short_title);
        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC, 2008, R.drawable.twoeuro_comm_2008_be, R.drawable.twoeuro_comm_2008_be_lightend, R.string.twoeuro_comm_2008_be_title, R.string.twoeuro_comm_2008_be_desc, R.string.twoeuro_comm_2008_be_volume, R.string.twoeuro_comm_2008_be_date, R.string.twoeuro_comm_2008_be_abr, R.string.twoeuro_comm_2008_be_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC, 2008, R.drawable.twoeuro_comm_2008_de, R.drawable.twoeuro_comm_2008_de_lightend, R.string.twoeuro_comm_2008_de_title, R.string.twoeuro_comm_2008_de_desc, R.string.twoeuro_comm_2008_de_volume, R.string.twoeuro_comm_2008_de_date, R.string.twoeuro_comm_2008_de_abr, R.string.twoeuro_comm_2008_de_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2008, R.drawable.twoeuro_comm_2008_fi, R.drawable.twoeuro_comm_2008_fi_lightend, R.string.twoeuro_comm_2008_fi_title, R.string.twoeuro_comm_2008_fi_desc, R.string.twoeuro_comm_2008_fi_volume, R.string.twoeuro_comm_2008_fi_date, R.string.twoeuro_comm_2008_fi_abr, R.string.twoeuro_comm_2008_fi_short_title);
        database.add2EuroCoin("fr", SpecialEuroCoin.COMMON_TITLE_2CC, 2008, R.drawable.twoeuro_comm_2008_fr, R.drawable.twoeuro_comm_2008_fr_lightend, R.string.twoeuro_comm_2008_fr_title, R.string.twoeuro_comm_2008_fr_desc, R.string.twoeuro_comm_2008_fr_volume, R.string.twoeuro_comm_2008_fr_date, R.string.twoeuro_comm_2008_fr_abr, R.string.twoeuro_comm_2008_fr_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC, 2008, R.drawable.twoeuro_comm_2008_it, R.drawable.twoeuro_comm_2008_it_lightend, R.string.twoeuro_comm_2008_it_title, R.string.twoeuro_comm_2008_it_desc, R.string.twoeuro_comm_2008_it_volume, R.string.twoeuro_comm_2008_it_date, R.string.twoeuro_comm_2008_it_abr, R.string.twoeuro_comm_2008_it_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2008, R.drawable.twoeuro_comm_2008_lu, R.drawable.twoeuro_comm_2008_lu_lightend, R.string.twoeuro_comm_2008_lu_title, R.string.twoeuro_comm_2008_lu_desc, R.string.twoeuro_comm_2008_lu_volume, R.string.twoeuro_comm_2008_lu_date, R.string.twoeuro_comm_2008_lu_abr, R.string.twoeuro_comm_2008_lu_short_title);
        database.add2EuroCoin("po", SpecialEuroCoin.COMMON_TITLE_2CC, 2008, R.drawable.twoeuro_comm_2008_po, R.drawable.twoeuro_comm_2008_po_lightend, R.string.twoeuro_comm_2008_po_title, R.string.twoeuro_comm_2008_po_desc, R.string.twoeuro_comm_2008_po_volume, R.string.twoeuro_comm_2008_po_date, R.string.twoeuro_comm_2008_po_abr, R.string.twoeuro_comm_2008_po_short_title);
        database.add2EuroCoin("si", SpecialEuroCoin.COMMON_TITLE_2CC, 2008, R.drawable.twoeuro_comm_2008_si, R.drawable.twoeuro_comm_2008_si_lightend, R.string.twoeuro_comm_2008_si_title, R.string.twoeuro_comm_2008_si_desc, R.string.twoeuro_comm_2008_si_volume, R.string.twoeuro_comm_2008_si_date, R.string.twoeuro_comm_2008_si_abr, R.string.twoeuro_comm_2008_si_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC, 2008, R.drawable.twoeuro_comm_2008_sm, R.drawable.twoeuro_comm_2008_sm_lightend, R.string.twoeuro_comm_2008_sm_title, R.string.twoeuro_comm_2008_sm_desc, R.string.twoeuro_comm_2008_sm_volume, R.string.twoeuro_comm_2008_sm_date, R.string.twoeuro_comm_2008_sm_abr, R.string.twoeuro_comm_2008_sm_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC, 2008, R.drawable.twoeuro_comm_2008_va, R.drawable.twoeuro_comm_2008_va_lightend, R.string.twoeuro_comm_2008_va_title, R.string.twoeuro_comm_2008_va_desc, R.string.twoeuro_comm_2008_va_volume, R.string.twoeuro_comm_2008_va_date, R.string.twoeuro_comm_2008_va_abr, R.string.twoeuro_comm_2008_va_short_title);
        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC, 2009, R.drawable.twoeuro_comm_2009_be, R.drawable.twoeuro_comm_2009_be_lightend, R.string.twoeuro_comm_2009_be_title, R.string.twoeuro_comm_2009_be_desc, R.string.twoeuro_comm_2009_be_volume, R.string.twoeuro_comm_2009_be_date, R.string.twoeuro_comm_2009_be_abr, R.string.twoeuro_comm_2009_be_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC, 2009, R.drawable.twoeuro_comm_2009_de, R.drawable.twoeuro_comm_2009_de_lightend, R.string.twoeuro_comm_2009_de_title, R.string.twoeuro_comm_2009_de_desc, R.string.twoeuro_comm_2009_de_volume, R.string.twoeuro_comm_2009_de_date, R.string.twoeuro_comm_2009_de_abr, R.string.twoeuro_comm_2009_de_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2009, R.drawable.twoeuro_comm_2009_fi, R.drawable.twoeuro_comm_2009_fi_lightend, R.string.twoeuro_comm_2009_fi_title, R.string.twoeuro_comm_2009_fi_desc, R.string.twoeuro_comm_2009_fi_volume, R.string.twoeuro_comm_2009_fi_date, R.string.twoeuro_comm_2009_fi_abr, R.string.twoeuro_comm_2009_fi_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC, 2009, R.drawable.twoeuro_comm_2009_it, R.drawable.twoeuro_comm_2009_it_lightend, R.string.twoeuro_comm_2009_it_title, R.string.twoeuro_comm_2009_it_desc, R.string.twoeuro_comm_2009_it_volume, R.string.twoeuro_comm_2009_it_date, R.string.twoeuro_comm_2009_it_abr, R.string.twoeuro_comm_2009_it_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2009, R.drawable.twoeuro_comm_2009_lu, R.drawable.twoeuro_comm_2009_lu_lightend, R.string.twoeuro_comm_2009_lu_title, R.string.twoeuro_comm_2009_lu_desc, R.string.twoeuro_comm_2009_lu_volume, R.string.twoeuro_comm_2009_lu_date, R.string.twoeuro_comm_2009_lu_abr, R.string.twoeuro_comm_2009_lu_short_title);
        database.add2EuroCoin("po", SpecialEuroCoin.COMMON_TITLE_2CC, 2009, R.drawable.twoeuro_comm_2009_po, R.drawable.twoeuro_comm_2009_po_lightend, R.string.twoeuro_comm_2009_po_title, R.string.twoeuro_comm_2009_po_desc, R.string.twoeuro_comm_2009_po_volume, R.string.twoeuro_comm_2009_po_date, R.string.twoeuro_comm_2009_po_abr, R.string.twoeuro_comm_2009_po_short_title);
        database.add2EuroCoin("sk", SpecialEuroCoin.COMMON_TITLE_2CC, 2009, R.drawable.twoeuro_comm_2009_sk, R.drawable.twoeuro_comm_2009_sk_lightend, R.string.twoeuro_comm_2009_sk_title, R.string.twoeuro_comm_2009_sk_desc, R.string.twoeuro_comm_2009_sk_volume, R.string.twoeuro_comm_2009_sk_date, R.string.twoeuro_comm_2009_sk_abr, R.string.twoeuro_comm_2009_sk_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC, 2009, R.drawable.twoeuro_comm_2009_sm, R.drawable.twoeuro_comm_2009_sm_lightend, R.string.twoeuro_comm_2009_sm_title, R.string.twoeuro_comm_2009_sm_desc, R.string.twoeuro_comm_2009_sm_volume, R.string.twoeuro_comm_2009_sm_date, R.string.twoeuro_comm_2009_sm_abr, R.string.twoeuro_comm_2009_sm_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC, 2009, R.drawable.twoeuro_comm_2009_va, R.drawable.twoeuro_comm_2009_va_lightend, R.string.twoeuro_comm_2009_va_title, R.string.twoeuro_comm_2009_va_desc, R.string.twoeuro_comm_2009_va_volume, R.string.twoeuro_comm_2009_va_date, R.string.twoeuro_comm_2009_va_abr, R.string.twoeuro_comm_2009_va_short_title);
        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC, 2010, R.drawable.twoeuro_comm_2010_be, R.drawable.twoeuro_comm_2010_be_lightend, R.string.twoeuro_comm_2010_be_title, R.string.twoeuro_comm_2010_be_desc, R.string.twoeuro_comm_2010_be_volume, R.string.twoeuro_comm_2010_be_date, R.string.twoeuro_comm_2010_be_abr, R.string.twoeuro_comm_2010_be_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC, 2010, R.drawable.twoeuro_comm_2010_de, R.drawable.twoeuro_comm_2010_de_lightend, R.string.twoeuro_comm_2010_de_title, R.string.twoeuro_comm_2010_de_desc, R.string.twoeuro_comm_2010_de_volume, R.string.twoeuro_comm_2010_de_date, R.string.twoeuro_comm_2010_de_abr, R.string.twoeuro_comm_2010_de_short_title);
        database.add2EuroCoin("gr", SpecialEuroCoin.COMMON_TITLE_2CC, 2010, R.drawable.twoeuro_comm_2010_gr, R.drawable.twoeuro_comm_2010_gr_lightend, R.string.twoeuro_comm_2010_gr_title, R.string.twoeuro_comm_2010_gr_desc, R.string.twoeuro_comm_2010_gr_volume, R.string.twoeuro_comm_2010_gr_date, R.string.twoeuro_comm_2010_gr_abr, R.string.twoeuro_comm_2010_gr_short_title);
        database.add2EuroCoin("es", SpecialEuroCoin.COMMON_TITLE_2CC, 2010, R.drawable.twoeuro_comm_2010_es, R.drawable.twoeuro_comm_2010_es_lightend, R.string.twoeuro_comm_2010_es_title, R.string.twoeuro_comm_2010_es_desc, R.string.twoeuro_comm_2010_es_volume, R.string.twoeuro_comm_2010_es_date, R.string.twoeuro_comm_2010_es_abr, R.string.twoeuro_comm_2010_es_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2010, R.drawable.twoeuro_comm_2010_fi, R.drawable.twoeuro_comm_2010_fi_lightend, R.string.twoeuro_comm_2010_fi_title, R.string.twoeuro_comm_2010_fi_desc, R.string.twoeuro_comm_2010_fi_volume, R.string.twoeuro_comm_2010_fi_date, R.string.twoeuro_comm_2010_fi_abr, R.string.twoeuro_comm_2010_fi_short_title);
        database.add2EuroCoin("fr", SpecialEuroCoin.COMMON_TITLE_2CC, 2010, R.drawable.twoeuro_comm_2010_fr, R.drawable.twoeuro_comm_2010_fr_lightend, R.string.twoeuro_comm_2010_fr_title, R.string.twoeuro_comm_2010_fr_desc, R.string.twoeuro_comm_2010_fr_volume, R.string.twoeuro_comm_2010_fr_date, R.string.twoeuro_comm_2010_fr_abr, R.string.twoeuro_comm_2010_fr_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC, 2010, R.drawable.twoeuro_comm_2010_it, R.drawable.twoeuro_comm_2010_it_lightend, R.string.twoeuro_comm_2010_it_title, R.string.twoeuro_comm_2010_it_desc, R.string.twoeuro_comm_2010_it_volume, R.string.twoeuro_comm_2010_it_date, R.string.twoeuro_comm_2010_it_abr, R.string.twoeuro_comm_2010_it_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2010, R.drawable.twoeuro_comm_2010_lu, R.drawable.twoeuro_comm_2010_lu_lightend, R.string.twoeuro_comm_2010_lu_title, R.string.twoeuro_comm_2010_lu_desc, R.string.twoeuro_comm_2010_lu_volume, R.string.twoeuro_comm_2010_lu_date, R.string.twoeuro_comm_2010_lu_abr, R.string.twoeuro_comm_2010_lu_short_title);
        database.add2EuroCoin("po", SpecialEuroCoin.COMMON_TITLE_2CC, 2010, R.drawable.twoeuro_comm_2010_po, R.drawable.twoeuro_comm_2010_po_lightend, R.string.twoeuro_comm_2010_po_title, R.string.twoeuro_comm_2010_po_desc, R.string.twoeuro_comm_2010_po_volume, R.string.twoeuro_comm_2010_po_date, R.string.twoeuro_comm_2010_po_abr, R.string.twoeuro_comm_2010_po_short_title);
        database.add2EuroCoin("si", SpecialEuroCoin.COMMON_TITLE_2CC, 2010, R.drawable.twoeuro_comm_2010_si, R.drawable.twoeuro_comm_2010_si_lightend, R.string.twoeuro_comm_2010_si_title, R.string.twoeuro_comm_2010_si_desc, R.string.twoeuro_comm_2010_si_volume, R.string.twoeuro_comm_2010_si_date, R.string.twoeuro_comm_2010_si_abr, R.string.twoeuro_comm_2010_si_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC, 2010, R.drawable.twoeuro_comm_2010_sm, R.drawable.twoeuro_comm_2010_sm_lightend, R.string.twoeuro_comm_2010_sm_title, R.string.twoeuro_comm_2010_sm_desc, R.string.twoeuro_comm_2010_sm_volume, R.string.twoeuro_comm_2010_sm_date, R.string.twoeuro_comm_2010_sm_abr, R.string.twoeuro_comm_2010_sm_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC, 2010, R.drawable.twoeuro_comm_2010_va, R.drawable.twoeuro_comm_2010_va_lightend, R.string.twoeuro_comm_2010_va_title, R.string.twoeuro_comm_2010_va_desc, R.string.twoeuro_comm_2010_va_volume, R.string.twoeuro_comm_2010_va_date, R.string.twoeuro_comm_2010_va_abr, R.string.twoeuro_comm_2010_va_short_title);
        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_be, R.drawable.twoeuro_comm_2011_be_lightend, R.string.twoeuro_comm_2011_be_title, R.string.twoeuro_comm_2011_be_desc, R.string.twoeuro_comm_2011_be_volume, R.string.twoeuro_comm_2011_be_date, R.string.twoeuro_comm_2011_be_abr, R.string.twoeuro_comm_2011_be_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_de, R.drawable.twoeuro_comm_2011_de_lightend, R.string.twoeuro_comm_2011_de_title, R.string.twoeuro_comm_2011_de_desc, R.string.twoeuro_comm_2011_de_volume, R.string.twoeuro_comm_2011_de_date, R.string.twoeuro_comm_2011_de_abr, R.string.twoeuro_comm_2011_de_short_title);
        database.add2EuroCoin("gr", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_gr, R.drawable.twoeuro_comm_2011_gr_lightend, R.string.twoeuro_comm_2011_gr_title, R.string.twoeuro_comm_2011_gr_desc, R.string.twoeuro_comm_2011_gr_volume, R.string.twoeuro_comm_2011_gr_date, R.string.twoeuro_comm_2011_gr_abr, R.string.twoeuro_comm_2011_gr_short_title);
        database.add2EuroCoin("es", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_es, R.drawable.twoeuro_comm_2011_es_lightend, R.string.twoeuro_comm_2011_es_title, R.string.twoeuro_comm_2011_es_desc, R.string.twoeuro_comm_2011_es_volume, R.string.twoeuro_comm_2011_es_date, R.string.twoeuro_comm_2011_es_abr, R.string.twoeuro_comm_2011_es_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_fi, R.drawable.twoeuro_comm_2011_fi_lightend, R.string.twoeuro_comm_2011_fi_title, R.string.twoeuro_comm_2011_fi_desc, R.string.twoeuro_comm_2011_fi_volume, R.string.twoeuro_comm_2011_fi_date, R.string.twoeuro_comm_2011_fi_abr, R.string.twoeuro_comm_2011_fi_short_title);
        database.add2EuroCoin("fr", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_fr, R.drawable.twoeuro_comm_2011_fr_lightend, R.string.twoeuro_comm_2011_fr_title, R.string.twoeuro_comm_2011_fr_desc, R.string.twoeuro_comm_2011_fr_volume, R.string.twoeuro_comm_2011_fr_date, R.string.twoeuro_comm_2011_fr_abr, R.string.twoeuro_comm_2011_fr_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_it, R.drawable.twoeuro_comm_2011_it_lightend, R.string.twoeuro_comm_2011_it_title, R.string.twoeuro_comm_2011_it_desc, R.string.twoeuro_comm_2011_it_volume, R.string.twoeuro_comm_2011_it_date, R.string.twoeuro_comm_2011_it_abr, R.string.twoeuro_comm_2011_it_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_lu, R.drawable.twoeuro_comm_2011_lu_lightend, R.string.twoeuro_comm_2011_lu_title, R.string.twoeuro_comm_2011_lu_desc, R.string.twoeuro_comm_2011_lu_volume, R.string.twoeuro_comm_2011_lu_date, R.string.twoeuro_comm_2011_lu_abr, R.string.twoeuro_comm_2011_lu_short_title);
        database.add2EuroCoin("mc", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_mc, R.drawable.twoeuro_comm_2011_mc_lightend, R.string.twoeuro_comm_2011_mc_title, R.string.twoeuro_comm_2011_mc_desc, R.string.twoeuro_comm_2011_mc_volume, R.string.twoeuro_comm_2011_mc_date, R.string.twoeuro_comm_2011_mc_abr, R.string.twoeuro_comm_2011_mc_short_title);
        database.add2EuroCoin("mt", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_mt, R.drawable.twoeuro_comm_2011_mt_lightend, R.string.twoeuro_comm_2011_mt_title, R.string.twoeuro_comm_2011_mt_desc, R.string.twoeuro_comm_2011_mt_volume, R.string.twoeuro_comm_2011_mt_date, R.string.twoeuro_comm_2011_mt_abr, R.string.twoeuro_comm_2011_mt_short_title);
        database.add2EuroCoin("ne", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_ne, R.drawable.twoeuro_comm_2011_ne_lightend, R.string.twoeuro_comm_2011_ne_title, R.string.twoeuro_comm_2011_ne_desc, R.string.twoeuro_comm_2011_ne_volume, R.string.twoeuro_comm_2011_ne_date, R.string.twoeuro_comm_2011_ne_abr, R.string.twoeuro_comm_2011_ne_short_title);
        database.add2EuroCoin("po", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_po, R.drawable.twoeuro_comm_2011_po_lightend, R.string.twoeuro_comm_2011_po_title, R.string.twoeuro_comm_2011_po_desc, R.string.twoeuro_comm_2011_po_volume, R.string.twoeuro_comm_2011_po_date, R.string.twoeuro_comm_2011_po_abr, R.string.twoeuro_comm_2011_po_short_title);
        database.add2EuroCoin("sk", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_sk, R.drawable.twoeuro_comm_2011_sk_lightend, R.string.twoeuro_comm_2011_sk_title, R.string.twoeuro_comm_2011_sk_desc, R.string.twoeuro_comm_2011_sk_volume, R.string.twoeuro_comm_2011_sk_date, R.string.twoeuro_comm_2011_sk_abr, R.string.twoeuro_comm_2011_sk_short_title);
        database.add2EuroCoin("si", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_si, R.drawable.twoeuro_comm_2011_si_lightend, R.string.twoeuro_comm_2011_si_title, R.string.twoeuro_comm_2011_si_desc, R.string.twoeuro_comm_2011_si_volume, R.string.twoeuro_comm_2011_si_date, R.string.twoeuro_comm_2011_si_abr, R.string.twoeuro_comm_2011_si_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_sm, R.drawable.twoeuro_comm_2011_sm_lightend, R.string.twoeuro_comm_2011_sm_title, R.string.twoeuro_comm_2011_sm_desc, R.string.twoeuro_comm_2011_sm_volume, R.string.twoeuro_comm_2011_sm_date, R.string.twoeuro_comm_2011_sm_abr, R.string.twoeuro_comm_2011_sm_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC, 2011, R.drawable.twoeuro_comm_2011_va, R.drawable.twoeuro_comm_2011_va_lightend, R.string.twoeuro_comm_2011_va_title, R.string.twoeuro_comm_2011_va_desc, R.string.twoeuro_comm_2011_va_volume, R.string.twoeuro_comm_2011_va_date, R.string.twoeuro_comm_2011_va_abr, R.string.twoeuro_comm_2011_va_short_title);
        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC, 2012, R.drawable.twoeuro_comm_2012_be, R.drawable.twoeuro_comm_2012_be_lightend, R.string.twoeuro_comm_2012_be_title, R.string.twoeuro_comm_2012_be_desc, R.string.twoeuro_comm_2012_be_volume, R.string.twoeuro_comm_2012_be_date, R.string.twoeuro_comm_2012_be_abr, R.string.twoeuro_comm_2012_be_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC, 2012, R.drawable.twoeuro_comm_2012_de, R.drawable.twoeuro_comm_2012_de_lightend, R.string.twoeuro_comm_2012_de_title, R.string.twoeuro_comm_2012_de_desc, R.string.twoeuro_comm_2012_de_volume, R.string.twoeuro_comm_2012_de_date, R.string.twoeuro_comm_2012_de_abr, R.string.twoeuro_comm_2012_de_short_title);
        database.add2EuroCoin("es", SpecialEuroCoin.COMMON_TITLE_2CC, 2012, R.drawable.twoeuro_comm_2012_es, R.drawable.twoeuro_comm_2012_es_lightend, R.string.twoeuro_comm_2012_es_title, R.string.twoeuro_comm_2012_es_desc, R.string.twoeuro_comm_2012_es_volume, R.string.twoeuro_comm_2012_es_date, R.string.twoeuro_comm_2012_es_abr, R.string.twoeuro_comm_2012_es_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2012, R.drawable.twoeuro_comm_2012_fi, R.drawable.twoeuro_comm_2012_fi_lightend, R.string.twoeuro_comm_2012_fi_title, R.string.twoeuro_comm_2012_fi_desc, R.string.twoeuro_comm_2012_fi_volume, R.string.twoeuro_comm_2012_fi_date, R.string.twoeuro_comm_2012_fi_abr, R.string.twoeuro_comm_2012_fi_short_title);
        database.add2EuroCoin("fr", SpecialEuroCoin.COMMON_TITLE_2CC, 2012, R.drawable.twoeuro_comm_2012_fr, R.drawable.twoeuro_comm_2012_fr_lightend, R.string.twoeuro_comm_2012_fr_title, R.string.twoeuro_comm_2012_fr_desc, R.string.twoeuro_comm_2012_fr_volume, R.string.twoeuro_comm_2012_fr_date, R.string.twoeuro_comm_2012_fr_abr, R.string.twoeuro_comm_2012_fr_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC, 2012, R.drawable.twoeuro_comm_2012_it, R.drawable.twoeuro_comm_2012_it_lightend, R.string.twoeuro_comm_2012_it_title, R.string.twoeuro_comm_2012_it_desc, R.string.twoeuro_comm_2012_it_volume, R.string.twoeuro_comm_2012_it_date, R.string.twoeuro_comm_2012_it_abr, R.string.twoeuro_comm_2012_it_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2012, R.drawable.twoeuro_comm_2012_lu, R.drawable.twoeuro_comm_2012_lu_lightend, R.string.twoeuro_comm_2012_lu_title, R.string.twoeuro_comm_2012_lu_desc, R.string.twoeuro_comm_2012_lu_volume, R.string.twoeuro_comm_2012_lu_date, R.string.twoeuro_comm_2012_lu_abr, R.string.twoeuro_comm_2012_lu_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2012, R.drawable.twoeuro_comm_2012_lu_2, R.drawable.twoeuro_comm_2012_lu_2_lightend, R.string.twoeuro_comm_2012_lu_2_title, R.string.twoeuro_comm_2012_lu_2_desc, R.string.twoeuro_comm_2012_lu_2_volume, R.string.twoeuro_comm_2012_lu_2_date, R.string.twoeuro_comm_2012_lu_2_abr, R.string.twoeuro_comm_2012_lu_2_short_title);
        database.add2EuroCoin("mc", SpecialEuroCoin.COMMON_TITLE_2CC, 2012, R.drawable.twoeuro_comm_2012_mc, R.drawable.twoeuro_comm_2012_mc_lightend, R.string.twoeuro_comm_2012_mc_title, R.string.twoeuro_comm_2012_mc_desc, R.string.twoeuro_comm_2012_mc_volume, R.string.twoeuro_comm_2012_mc_date, R.string.twoeuro_comm_2012_mc_abr, R.string.twoeuro_comm_2012_mc_short_title);
        database.add2EuroCoin("mt", SpecialEuroCoin.COMMON_TITLE_2CC, 2012, R.drawable.twoeuro_comm_2012_mt, R.drawable.twoeuro_comm_2012_mt_lightend, R.string.twoeuro_comm_2012_mt_title, R.string.twoeuro_comm_2012_mt_desc, R.string.twoeuro_comm_2012_mt_volume, R.string.twoeuro_comm_2012_mt_date, R.string.twoeuro_comm_2012_mt_abr, R.string.twoeuro_comm_2012_mt_short_title);
        database.add2EuroCoin("po", SpecialEuroCoin.COMMON_TITLE_2CC, 2012, R.drawable.twoeuro_comm_2012_po, R.drawable.twoeuro_comm_2012_po_lightend, R.string.twoeuro_comm_2012_po_title, R.string.twoeuro_comm_2012_po_desc, R.string.twoeuro_comm_2012_po_volume, R.string.twoeuro_comm_2012_po_date, R.string.twoeuro_comm_2012_po_abr, R.string.twoeuro_comm_2012_po_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC, 2012, R.drawable.twoeuro_comm_2012_va, R.drawable.twoeuro_comm_2012_va_lightend, R.string.twoeuro_comm_2012_va_title, R.string.twoeuro_comm_2012_va_desc, R.string.twoeuro_comm_2012_va_volume, R.string.twoeuro_comm_2012_va_date, R.string.twoeuro_comm_2012_va_abr, R.string.twoeuro_comm_2012_va_short_title);
        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_be, R.drawable.twoeuro_comm_2013_be_lightend, R.string.twoeuro_comm_2013_be_title, R.string.twoeuro_comm_2013_be_desc, R.string.twoeuro_comm_2013_be_volume, R.string.twoeuro_comm_2013_be_date, R.string.twoeuro_comm_2013_be_abr, R.string.twoeuro_comm_2013_be_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_de, R.drawable.twoeuro_comm_2013_de_lightend, R.string.twoeuro_comm_2013_de_title, R.string.twoeuro_comm_2013_de_desc, R.string.twoeuro_comm_2013_de_volume, R.string.twoeuro_comm_2013_de_date, R.string.twoeuro_comm_2013_de_abr, R.string.twoeuro_comm_2013_de_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2013, R.drawable.twoeuro_comm_2013_de_2, R.drawable.twoeuro_comm_2013_de_2_lightend, R.string.twoeuro_comm_2013_de_2_title, R.string.twoeuro_comm_2013_de_2_desc, R.string.twoeuro_comm_2013_de_2_volume, R.string.twoeuro_comm_2013_de_2_date, R.string.twoeuro_comm_2013_de_2_abr, R.string.twoeuro_comm_2013_de_2_short_title);
        database.add2EuroCoin("es", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_es, R.drawable.twoeuro_comm_2013_es_lightend, R.string.twoeuro_comm_2013_es_title, R.string.twoeuro_comm_2013_es_desc, R.string.twoeuro_comm_2013_es_volume, R.string.twoeuro_comm_2013_es_date, R.string.twoeuro_comm_2013_es_abr, R.string.twoeuro_comm_2013_es_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_fi, R.drawable.twoeuro_comm_2013_fi_lightend, R.string.twoeuro_comm_2013_fi_title, R.string.twoeuro_comm_2013_fi_desc, R.string.twoeuro_comm_2013_fi_volume, R.string.twoeuro_comm_2013_fi_date, R.string.twoeuro_comm_2013_fi_abr, R.string.twoeuro_comm_2013_fi_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2013, R.drawable.twoeuro_comm_2013_fi_2, R.drawable.twoeuro_comm_2013_fi_2_lightend, R.string.twoeuro_comm_2013_fi_2_title, R.string.twoeuro_comm_2013_fi_2_desc, R.string.twoeuro_comm_2013_fi_2_volume, R.string.twoeuro_comm_2013_fi_2_date, R.string.twoeuro_comm_2013_fi_2_abr, R.string.twoeuro_comm_2013_fi_2_short_title);
        database.add2EuroCoin("fr", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_fr, R.drawable.twoeuro_comm_2013_fr_lightend, R.string.twoeuro_comm_2013_fr_title, R.string.twoeuro_comm_2013_fr_desc, R.string.twoeuro_comm_2013_fr_volume, R.string.twoeuro_comm_2013_fr_date, R.string.twoeuro_comm_2013_fr_abr, R.string.twoeuro_comm_2013_fr_short_title);
        database.add2EuroCoin("fr", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2013, R.drawable.twoeuro_comm_2013_fr_2, R.drawable.twoeuro_comm_2013_fr_2_lightend, R.string.twoeuro_comm_2013_fr_2_title, R.string.twoeuro_comm_2013_fr_2_desc, R.string.twoeuro_comm_2013_fr_2_volume, R.string.twoeuro_comm_2013_fr_2_date, R.string.twoeuro_comm_2013_fr_2_abr, R.string.twoeuro_comm_2013_fr_2_short_title);
        database.add2EuroCoin("gr", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_gr, R.drawable.twoeuro_comm_2013_gr_lightend, R.string.twoeuro_comm_2013_gr_title, R.string.twoeuro_comm_2013_gr_desc, R.string.twoeuro_comm_2013_gr_volume, R.string.twoeuro_comm_2013_gr_date, R.string.twoeuro_comm_2013_gr_abr, R.string.twoeuro_comm_2013_gr_short_title);
        database.add2EuroCoin("gr", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2013, R.drawable.twoeuro_comm_2013_gr_2, R.drawable.twoeuro_comm_2013_gr_2_lightend, R.string.twoeuro_comm_2013_gr_2_title, R.string.twoeuro_comm_2013_gr_2_desc, R.string.twoeuro_comm_2013_gr_2_volume, R.string.twoeuro_comm_2013_gr_2_date, R.string.twoeuro_comm_2013_gr_2_abr, R.string.twoeuro_comm_2013_gr_2_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_it, R.drawable.twoeuro_comm_2013_it_lightend, R.string.twoeuro_comm_2013_it_title, R.string.twoeuro_comm_2013_it_desc, R.string.twoeuro_comm_2013_it_volume, R.string.twoeuro_comm_2013_it_date, R.string.twoeuro_comm_2013_it_abr, R.string.twoeuro_comm_2013_it_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2013, R.drawable.twoeuro_comm_2013_it_2, R.drawable.twoeuro_comm_2013_it_2_lightend, R.string.twoeuro_comm_2013_it_2_title, R.string.twoeuro_comm_2013_it_2_desc, R.string.twoeuro_comm_2013_it_2_volume, R.string.twoeuro_comm_2013_it_2_date, R.string.twoeuro_comm_2013_it_2_abr, R.string.twoeuro_comm_2013_it_2_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_lu, R.drawable.twoeuro_comm_2013_lu_lightend, R.string.twoeuro_comm_2013_lu_title, R.string.twoeuro_comm_2013_lu_desc, R.string.twoeuro_comm_2013_lu_volume, R.string.twoeuro_comm_2013_lu_date, R.string.twoeuro_comm_2013_lu_abr, R.string.twoeuro_comm_2013_lu_short_title);
        database.add2EuroCoin("mc", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_mc, R.drawable.twoeuro_comm_2013_mc_lightend, R.string.twoeuro_comm_2013_mc_title, R.string.twoeuro_comm_2013_mc_desc, R.string.twoeuro_comm_2013_mc_volume, R.string.twoeuro_comm_2013_mc_date, R.string.twoeuro_comm_2013_mc_abr, R.string.twoeuro_comm_2013_mc_short_title);
        database.add2EuroCoin("mt", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_mt, R.drawable.twoeuro_comm_2013_mt_lightend, R.string.twoeuro_comm_2013_mt_title, R.string.twoeuro_comm_2013_mt_desc, R.string.twoeuro_comm_2013_mt_volume, R.string.twoeuro_comm_2013_mt_date, R.string.twoeuro_comm_2013_mt_abr, R.string.twoeuro_comm_2013_mt_short_title);
        database.add2EuroCoin("ne", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_ne, R.drawable.twoeuro_comm_2013_ne_lightend, R.string.twoeuro_comm_2013_ne_title, R.string.twoeuro_comm_2013_ne_desc, R.string.twoeuro_comm_2013_ne_volume, R.string.twoeuro_comm_2013_ne_date, R.string.twoeuro_comm_2013_ne_abr, R.string.twoeuro_comm_2013_ne_short_title);
        database.add2EuroCoin("ne", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2013, R.drawable.twoeuro_comm_2013_ne_2, R.drawable.twoeuro_comm_2013_ne_2_lightend, R.string.twoeuro_comm_2013_ne_2_title, R.string.twoeuro_comm_2013_ne_2_desc, R.string.twoeuro_comm_2013_ne_2_volume, R.string.twoeuro_comm_2013_ne_2_date, R.string.twoeuro_comm_2013_ne_2_abr, R.string.twoeuro_comm_2013_ne_2_short_title);
        database.add2EuroCoin("po", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_po, R.drawable.twoeuro_comm_2013_po_lightend, R.string.twoeuro_comm_2013_po_title, R.string.twoeuro_comm_2013_po_desc, R.string.twoeuro_comm_2013_po_volume, R.string.twoeuro_comm_2013_po_date, R.string.twoeuro_comm_2013_po_abr, R.string.twoeuro_comm_2013_po_short_title);
        database.add2EuroCoin("sk", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_sk, R.drawable.twoeuro_comm_2013_sk_lightend, R.string.twoeuro_comm_2013_sk_title, R.string.twoeuro_comm_2013_sk_desc, R.string.twoeuro_comm_2013_sk_volume, R.string.twoeuro_comm_2013_sk_date, R.string.twoeuro_comm_2013_sk_abr, R.string.twoeuro_comm_2013_sk_short_title);
        database.add2EuroCoin("si", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_si, R.drawable.twoeuro_comm_2013_si_lightend, R.string.twoeuro_comm_2013_si_title, R.string.twoeuro_comm_2013_si_desc, R.string.twoeuro_comm_2013_si_volume, R.string.twoeuro_comm_2013_si_date, R.string.twoeuro_comm_2013_si_abr, R.string.twoeuro_comm_2013_si_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_sm, R.drawable.twoeuro_comm_2013_sm_lightend, R.string.twoeuro_comm_2013_sm_title, R.string.twoeuro_comm_2013_sm_desc, R.string.twoeuro_comm_2013_sm_volume, R.string.twoeuro_comm_2013_sm_date, R.string.twoeuro_comm_2013_sm_abr, R.string.twoeuro_comm_2013_sm_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC, 2013, R.drawable.twoeuro_comm_2013_va, R.drawable.twoeuro_comm_2013_va_lightend, R.string.twoeuro_comm_2013_va_title, R.string.twoeuro_comm_2013_va_desc, R.string.twoeuro_comm_2013_va_volume, R.string.twoeuro_comm_2013_va_date, R.string.twoeuro_comm_2013_va_abr, R.string.twoeuro_comm_2013_va_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2013, R.drawable.twoeuro_comm_2013_va_2, R.drawable.twoeuro_comm_2013_va_2_lightend, R.string.twoeuro_comm_2013_va_2_title, R.string.twoeuro_comm_2013_va_2_desc, R.string.twoeuro_comm_2013_va_2_volume, R.string.twoeuro_comm_2013_va_2_date, R.string.twoeuro_comm_2013_va_2_abr, R.string.twoeuro_comm_2013_va_2_short_title);
        database.add2EuroCoin("ad", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_ad, R.drawable.twoeuro_comm_2014_ad_lightend, R.string.twoeuro_comm_2014_ad_title, R.string.twoeuro_comm_2014_ad_desc, R.string.twoeuro_comm_2014_ad_volume, R.string.twoeuro_comm_2014_ad_date, R.string.twoeuro_comm_2014_ad_abr, R.string.twoeuro_comm_2014_ad_short_title);
        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_be, R.drawable.twoeuro_comm_2014_be_lightend, R.string.twoeuro_comm_2014_be_title, R.string.twoeuro_comm_2014_be_desc, R.string.twoeuro_comm_2014_be_volume, R.string.twoeuro_comm_2014_be_date, R.string.twoeuro_comm_2014_be_abr, R.string.twoeuro_comm_2014_be_short_title);
        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2014, R.drawable.twoeuro_comm_2014_be_2, R.drawable.twoeuro_comm_2014_be_2_lightend, R.string.twoeuro_comm_2014_be_2_title, R.string.twoeuro_comm_2014_be_2_desc, R.string.twoeuro_comm_2014_be_2_volume, R.string.twoeuro_comm_2014_be_2_date, R.string.twoeuro_comm_2014_be_2_abr, R.string.twoeuro_comm_2014_be_2_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_de, R.drawable.twoeuro_comm_2014_de_lightend, R.string.twoeuro_comm_2014_de_title, R.string.twoeuro_comm_2014_de_desc, R.string.twoeuro_comm_2014_de_volume, R.string.twoeuro_comm_2014_de_date, R.string.twoeuro_comm_2014_de_abr, R.string.twoeuro_comm_2014_de_short_title);
        database.add2EuroCoin("es", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_es, R.drawable.twoeuro_comm_2014_es_lightend, R.string.twoeuro_comm_2014_es_title, R.string.twoeuro_comm_2014_es_desc, R.string.twoeuro_comm_2014_es_volume, R.string.twoeuro_comm_2014_es_date, R.string.twoeuro_comm_2014_es_abr, R.string.twoeuro_comm_2014_es_short_title);
        database.add2EuroCoin("es", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2014, R.drawable.twoeuro_comm_2014_es_2, R.drawable.twoeuro_comm_2014_es_2_lightend, R.string.twoeuro_comm_2014_es_2_title, R.string.twoeuro_comm_2014_es_2_desc, R.string.twoeuro_comm_2014_es_2_volume, R.string.twoeuro_comm_2014_es_2_date, R.string.twoeuro_comm_2014_es_2_abr, R.string.twoeuro_comm_2014_es_2_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_fi, R.drawable.twoeuro_comm_2014_fi_lightend, R.string.twoeuro_comm_2014_fi_title, R.string.twoeuro_comm_2014_fi_desc, R.string.twoeuro_comm_2014_fi_volume, R.string.twoeuro_comm_2014_fi_date, R.string.twoeuro_comm_2014_fi_abr, R.string.twoeuro_comm_2014_fi_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2014, R.drawable.twoeuro_comm_2014_fi_2, R.drawable.twoeuro_comm_2014_fi_2_lightend, R.string.twoeuro_comm_2014_fi_2_title, R.string.twoeuro_comm_2014_fi_2_desc, R.string.twoeuro_comm_2014_fi_2_volume, R.string.twoeuro_comm_2014_fi_2_date, R.string.twoeuro_comm_2014_fi_2_abr, R.string.twoeuro_comm_2014_fi_2_short_title);
        database.add2EuroCoin("fr", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_fr, R.drawable.twoeuro_comm_2014_fr_lightend, R.string.twoeuro_comm_2014_fr_title, R.string.twoeuro_comm_2014_fr_desc, R.string.twoeuro_comm_2014_fr_volume, R.string.twoeuro_comm_2014_fr_date, R.string.twoeuro_comm_2014_fr_abr, R.string.twoeuro_comm_2014_fr_short_title);
        database.add2EuroCoin("fr", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2014, R.drawable.twoeuro_comm_2014_fr_2, R.drawable.twoeuro_comm_2014_fr_2_lightend, R.string.twoeuro_comm_2014_fr_2_title, R.string.twoeuro_comm_2014_fr_2_desc, R.string.twoeuro_comm_2014_fr_2_volume, R.string.twoeuro_comm_2014_fr_2_date, R.string.twoeuro_comm_2014_fr_2_abr, R.string.twoeuro_comm_2014_fr_2_short_title);
        database.add2EuroCoin("gr", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_gr, R.drawable.twoeuro_comm_2014_gr_lightend, R.string.twoeuro_comm_2014_gr_title, R.string.twoeuro_comm_2014_gr_desc, R.string.twoeuro_comm_2014_gr_volume, R.string.twoeuro_comm_2014_gr_date, R.string.twoeuro_comm_2014_gr_abr, R.string.twoeuro_comm_2014_gr_short_title);
        database.add2EuroCoin("gr", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2014, R.drawable.twoeuro_comm_2014_gr_2, R.drawable.twoeuro_comm_2014_gr_2_lightend, R.string.twoeuro_comm_2014_gr_2_title, R.string.twoeuro_comm_2014_gr_2_desc, R.string.twoeuro_comm_2014_gr_2_volume, R.string.twoeuro_comm_2014_gr_2_date, R.string.twoeuro_comm_2014_gr_2_abr, R.string.twoeuro_comm_2014_gr_2_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_it, R.drawable.twoeuro_comm_2014_it_lightend, R.string.twoeuro_comm_2014_it_title, R.string.twoeuro_comm_2014_it_desc, R.string.twoeuro_comm_2014_it_volume, R.string.twoeuro_comm_2014_it_date, R.string.twoeuro_comm_2014_it_abr, R.string.twoeuro_comm_2014_it_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2014, R.drawable.twoeuro_comm_2014_it_2, R.drawable.twoeuro_comm_2014_it_2_lightend, R.string.twoeuro_comm_2014_it_2_title, R.string.twoeuro_comm_2014_it_2_desc, R.string.twoeuro_comm_2014_it_2_volume, R.string.twoeuro_comm_2014_it_2_date, R.string.twoeuro_comm_2014_it_2_abr, R.string.twoeuro_comm_2014_it_2_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_lu, R.drawable.twoeuro_comm_2014_lu_lightend, R.string.twoeuro_comm_2014_lu_title, R.string.twoeuro_comm_2014_lu_desc, R.string.twoeuro_comm_2014_lu_volume, R.string.twoeuro_comm_2014_lu_date, R.string.twoeuro_comm_2014_lu_abr, R.string.twoeuro_comm_2014_lu_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2014, R.drawable.twoeuro_comm_2014_lu_2, R.drawable.twoeuro_comm_2014_lu_2_lightend, R.string.twoeuro_comm_2014_lu_2_title, R.string.twoeuro_comm_2014_lu_2_desc, R.string.twoeuro_comm_2014_lu_2_volume, R.string.twoeuro_comm_2014_lu_2_date, R.string.twoeuro_comm_2014_lu_2_abr, R.string.twoeuro_comm_2014_lu_2_short_title);
        database.add2EuroCoin("lv", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_lv, R.drawable.twoeuro_comm_2014_lv_lightend, R.string.twoeuro_comm_2014_lv_title, R.string.twoeuro_comm_2014_lv_desc, R.string.twoeuro_comm_2014_lv_volvme, R.string.twoeuro_comm_2014_lv_date, R.string.twoeuro_comm_2014_lv_abr, R.string.twoeuro_comm_2014_lv_short_title);
        database.add2EuroCoin("mt", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_mt, R.drawable.twoeuro_comm_2014_mt_lightend, R.string.twoeuro_comm_2014_mt_title, R.string.twoeuro_comm_2014_mt_desc, R.string.twoeuro_comm_2014_mt_volume, R.string.twoeuro_comm_2014_mt_date, R.string.twoeuro_comm_2014_mt_abr, R.string.twoeuro_comm_2014_mt_short_title);
        database.add2EuroCoin("mt", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2014, R.drawable.twoeuro_comm_2014_mt_2, R.drawable.twoeuro_comm_2014_mt_2_lightend, R.string.twoeuro_comm_2014_mt_2_title, R.string.twoeuro_comm_2014_mt_2_desc, R.string.twoeuro_comm_2014_mt_2_volume, R.string.twoeuro_comm_2014_mt_2_date, R.string.twoeuro_comm_2014_mt_2_abr, R.string.twoeuro_comm_2014_mt_2_short_title);
        database.add2EuroCoin("ne", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_ne, R.drawable.twoeuro_comm_2014_ne_lightend, R.string.twoeuro_comm_2014_ne_title, R.string.twoeuro_comm_2014_ne_desc, R.string.twoeuro_comm_2014_ne_volume, R.string.twoeuro_comm_2014_ne_date, R.string.twoeuro_comm_2014_ne_abr, R.string.twoeuro_comm_2014_ne_short_title);
        database.add2EuroCoin("po", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_po, R.drawable.twoeuro_comm_2014_po_lightend, R.string.twoeuro_comm_2014_po_title, R.string.twoeuro_comm_2014_po_desc, R.string.twoeuro_comm_2014_po_volume, R.string.twoeuro_comm_2014_po_date, R.string.twoeuro_comm_2014_po_abr, R.string.twoeuro_comm_2014_po_short_title);
        database.add2EuroCoin("po", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2014, R.drawable.twoeuro_comm_2014_po_2, R.drawable.twoeuro_comm_2014_po_2_lightend, R.string.twoeuro_comm_2014_po_2_title, R.string.twoeuro_comm_2014_po_2_desc, R.string.twoeuro_comm_2014_po_2_volume, R.string.twoeuro_comm_2014_po_2_date, R.string.twoeuro_comm_2014_po_2_abr, R.string.twoeuro_comm_2014_po_2_short_title);
        database.add2EuroCoin("si", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_sl, R.drawable.twoeuro_comm_2014_sl_lightend, R.string.twoeuro_comm_2014_sl_title, R.string.twoeuro_comm_2014_sl_desc, R.string.twoeuro_comm_2014_sl_volume, R.string.twoeuro_comm_2014_sl_date, R.string.twoeuro_comm_2014_sl_abr, R.string.twoeuro_comm_2014_sl_short_title);
        database.add2EuroCoin("sk", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_sk, R.drawable.twoeuro_comm_2014_sk_lightend, R.string.twoeuro_comm_2014_sk_title, R.string.twoeuro_comm_2014_sk_desc, R.string.twoeuro_comm_2014_sk_volume, R.string.twoeuro_comm_2014_sk_date, R.string.twoeuro_comm_2014_sk_abr, R.string.twoeuro_comm_2014_sk_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_sm, R.drawable.twoeuro_comm_2014_sm_lightend, R.string.twoeuro_comm_2014_sm_title, R.string.twoeuro_comm_2014_sm_desc, R.string.twoeuro_comm_2014_sm_volume, R.string.twoeuro_comm_2014_sm_date, R.string.twoeuro_comm_2014_sm_abr, R.string.twoeuro_comm_2014_sm_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2014, R.drawable.twoeuro_comm_2014_sm_2, R.drawable.twoeuro_comm_2014_sm_2_lightend, R.string.twoeuro_comm_2014_sm_2_title, R.string.twoeuro_comm_2014_sm_2_desc, R.string.twoeuro_comm_2014_sm_2_volume, R.string.twoeuro_comm_2014_sm_2_date, R.string.twoeuro_comm_2014_sm_2_abr, R.string.twoeuro_comm_2014_sm_2_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC, 2014, R.drawable.twoeuro_comm_2014_va, R.drawable.twoeuro_comm_2014_va_lightend, R.string.twoeuro_comm_2014_va_title, R.string.twoeuro_comm_2014_va_desc, R.string.twoeuro_comm_2014_va_volume, R.string.twoeuro_comm_2014_va_date, R.string.twoeuro_comm_2014_va_abr, R.string.twoeuro_comm_2014_va_short_title);

        database.add2EuroCoin("ad", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_ad, R.drawable.twoeuro_comm_2015_ad_lightend, R.string.twoeuro_comm_2015_ad_title, R.string.twoeuro_comm_2015_ad_desc, R.string.twoeuro_comm_2015_ad_volume, R.string.twoeuro_comm_2015_ad_date, R.string.twoeuro_comm_2015_ad_abr, R.string.twoeuro_comm_2015_ad_short_title);
        database.add2EuroCoin("ad", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2015, R.drawable.twoeuro_comm_2015_ad_2, R.drawable.twoeuro_comm_2015_ad_2_lightend, R.string.twoeuro_comm_2015_ad_2_title, R.string.twoeuro_comm_2015_ad_2_desc, R.string.twoeuro_comm_2015_ad_2_volume, R.string.twoeuro_comm_2015_ad_2_date, R.string.twoeuro_comm_2015_ad_2_abr, R.string.twoeuro_comm_2015_ad_2_short_title);
        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_be, R.drawable.twoeuro_comm_2015_be_lightend, R.string.twoeuro_comm_2015_be_title, R.string.twoeuro_comm_2015_be_desc, R.string.twoeuro_comm_2015_be_volume, R.string.twoeuro_comm_2015_be_date, R.string.twoeuro_comm_2015_be_abr, R.string.twoeuro_comm_2015_be_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_de, R.drawable.twoeuro_comm_2015_de_lightend, R.string.twoeuro_comm_2015_de_title, R.string.twoeuro_comm_2015_de_desc, R.string.twoeuro_comm_2015_de_volume, R.string.twoeuro_comm_2015_de_date, R.string.twoeuro_comm_2015_de_abr, R.string.twoeuro_comm_2015_de_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2015, R.drawable.twoeuro_comm_2015_de_2, R.drawable.twoeuro_comm_2015_de_2_lightend, R.string.twoeuro_comm_2015_de_2_title, R.string.twoeuro_comm_2015_de_2_desc, R.string.twoeuro_comm_2015_de_2_volume, R.string.twoeuro_comm_2015_de_2_date, R.string.twoeuro_comm_2015_de_2_abr, R.string.twoeuro_comm_2015_de_2_short_title);
        database.add2EuroCoin("es", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_es, R.drawable.twoeuro_comm_2015_es_lightend, R.string.twoeuro_comm_2015_es_title, R.string.twoeuro_comm_2015_es_desc, R.string.twoeuro_comm_2015_es_volume, R.string.twoeuro_comm_2015_es_date, R.string.twoeuro_comm_2015_es_abr, R.string.twoeuro_comm_2015_es_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_fi, R.drawable.twoeuro_comm_2015_fi_lightend, R.string.twoeuro_comm_2015_fi_title, R.string.twoeuro_comm_2015_fi_desc, R.string.twoeuro_comm_2015_fi_volume, R.string.twoeuro_comm_2015_fi_date, R.string.twoeuro_comm_2015_fi_abr, R.string.twoeuro_comm_2015_fi_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2015, R.drawable.twoeuro_comm_2015_fi_2, R.drawable.twoeuro_comm_2015_fi_2_lightend, R.string.twoeuro_comm_2015_fi_2_title, R.string.twoeuro_comm_2015_fi_2_desc, R.string.twoeuro_comm_2015_fi_2_volume, R.string.twoeuro_comm_2015_fi_2_date, R.string.twoeuro_comm_2015_fi_2_abr, R.string.twoeuro_comm_2015_fi_2_short_title);
        database.add2EuroCoin("fr", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_fr, R.drawable.twoeuro_comm_2015_fr_lightend, R.string.twoeuro_comm_2015_fr_title, R.string.twoeuro_comm_2015_fr_desc, R.string.twoeuro_comm_2015_fr_volume, R.string.twoeuro_comm_2015_fr_date, R.string.twoeuro_comm_2015_fr_abr, R.string.twoeuro_comm_2015_fr_short_title);
        database.add2EuroCoin("fr", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2015, R.drawable.twoeuro_comm_2015_fr_2, R.drawable.twoeuro_comm_2015_fr_2_lightend, R.string.twoeuro_comm_2015_fr_2_title, R.string.twoeuro_comm_2015_fr_2_desc, R.string.twoeuro_comm_2015_fr_2_volume, R.string.twoeuro_comm_2015_fr_2_date, R.string.twoeuro_comm_2015_fr_2_abr, R.string.twoeuro_comm_2015_fr_2_short_title);
        database.add2EuroCoin("gr", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_gr, R.drawable.twoeuro_comm_2015_gr_lightend, R.string.twoeuro_comm_2015_gr_title, R.string.twoeuro_comm_2015_gr_desc, R.string.twoeuro_comm_2015_gr_volume, R.string.twoeuro_comm_2015_gr_date, R.string.twoeuro_comm_2015_gr_abr, R.string.twoeuro_comm_2015_gr_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_it, R.drawable.twoeuro_comm_2015_it_lightend, R.string.twoeuro_comm_2015_it_title, R.string.twoeuro_comm_2015_it_desc, R.string.twoeuro_comm_2015_it_volume, R.string.twoeuro_comm_2015_it_date, R.string.twoeuro_comm_2015_it_abr, R.string.twoeuro_comm_2015_it_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2015, R.drawable.twoeuro_comm_2015_it_2, R.drawable.twoeuro_comm_2015_it_2_lightend, R.string.twoeuro_comm_2015_it_2_title, R.string.twoeuro_comm_2015_it_2_desc, R.string.twoeuro_comm_2015_it_2_volume, R.string.twoeuro_comm_2015_it_2_date, R.string.twoeuro_comm_2015_it_2_abr, R.string.twoeuro_comm_2015_it_2_short_title);
        database.add2EuroCoin("lt", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_lt, R.drawable.twoeuro_comm_2015_lt_lightend, R.string.twoeuro_comm_2015_lt_title, R.string.twoeuro_comm_2015_lt_desc, R.string.twoeuro_comm_2015_lt_volume, R.string.twoeuro_comm_2015_lt_date, R.string.twoeuro_comm_2015_lt_abr, R.string.twoeuro_comm_2015_lt_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_lu, R.drawable.twoeuro_comm_2015_lu_lightend, R.string.twoeuro_comm_2015_lu_title, R.string.twoeuro_comm_2015_lu_desc, R.string.twoeuro_comm_2015_lu_volume, R.string.twoeuro_comm_2015_lu_date, R.string.twoeuro_comm_2015_lu_abr, R.string.twoeuro_comm_2015_lu_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2015, R.drawable.twoeuro_comm_2015_lu_2, R.drawable.twoeuro_comm_2015_lu_2_lightend, R.string.twoeuro_comm_2015_lu_2_title, R.string.twoeuro_comm_2015_lu_2_desc, R.string.twoeuro_comm_2015_lu_2_volume, R.string.twoeuro_comm_2015_lu_2_date, R.string.twoeuro_comm_2015_lu_2_abr, R.string.twoeuro_comm_2015_lu_2_short_title);
        database.add2EuroCoin("lv", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_lv, R.drawable.twoeuro_comm_2015_lv_lightend, R.string.twoeuro_comm_2015_lv_title, R.string.twoeuro_comm_2015_lv_desc, R.string.twoeuro_comm_2015_lv_volume, R.string.twoeuro_comm_2015_lv_date, R.string.twoeuro_comm_2015_lv_abr, R.string.twoeuro_comm_2015_lv_short_title);
        database.add2EuroCoin("lv", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2015, R.drawable.twoeuro_comm_2015_lv_2, R.drawable.twoeuro_comm_2015_lv_2_lightend, R.string.twoeuro_comm_2015_lv_2_title, R.string.twoeuro_comm_2015_lv_2_desc, R.string.twoeuro_comm_2015_lv_2_volume, R.string.twoeuro_comm_2015_lv_2_date, R.string.twoeuro_comm_2015_lv_2_abr, R.string.twoeuro_comm_2015_lv_2_short_title);
        database.add2EuroCoin("mc", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_mc, R.drawable.twoeuro_comm_2015_mc_lightend, R.string.twoeuro_comm_2015_mc_title, R.string.twoeuro_comm_2015_mc_desc, R.string.twoeuro_comm_2015_mc_volume, R.string.twoeuro_comm_2015_mc_date, R.string.twoeuro_comm_2015_mc_abr, R.string.twoeuro_comm_2015_mc_short_title);
        database.add2EuroCoin("mt", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_mt, R.drawable.twoeuro_comm_2015_mt_lightend, R.string.twoeuro_comm_2015_mt_title, R.string.twoeuro_comm_2015_mt_desc, R.string.twoeuro_comm_2015_mt_volume, R.string.twoeuro_comm_2015_mt_date, R.string.twoeuro_comm_2015_mt_abr, R.string.twoeuro_comm_2015_mt_short_title);
        database.add2EuroCoin("mt", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2015, R.drawable.twoeuro_comm_2015_mt_2, R.drawable.twoeuro_comm_2015_mt_2_lightend, R.string.twoeuro_comm_2015_mt_2_title, R.string.twoeuro_comm_2015_mt_2_desc, R.string.twoeuro_comm_2015_mt_2_volume, R.string.twoeuro_comm_2015_mt_2_date, R.string.twoeuro_comm_2015_mt_2_abr, R.string.twoeuro_comm_2015_mt_2_short_title);
        database.add2EuroCoin("po", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_po, R.drawable.twoeuro_comm_2015_po_lightend, R.string.twoeuro_comm_2015_po_title, R.string.twoeuro_comm_2015_po_desc, R.string.twoeuro_comm_2015_po_volume, R.string.twoeuro_comm_2015_po_date, R.string.twoeuro_comm_2015_po_abr, R.string.twoeuro_comm_2015_po_short_title);
        database.add2EuroCoin("po", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2015, R.drawable.twoeuro_comm_2015_po_2, R.drawable.twoeuro_comm_2015_po_2_lightend, R.string.twoeuro_comm_2015_po_2_title, R.string.twoeuro_comm_2015_po_2_desc, R.string.twoeuro_comm_2015_po_2_volume, R.string.twoeuro_comm_2015_po_2_date, R.string.twoeuro_comm_2015_po_2_abr, R.string.twoeuro_comm_2015_po_2_short_title);
        database.add2EuroCoin("sk", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_sk, R.drawable.twoeuro_comm_2015_sk_lightend, R.string.twoeuro_comm_2015_sk_title, R.string.twoeuro_comm_2015_sk_desc, R.string.twoeuro_comm_2015_sk_volume, R.string.twoeuro_comm_2015_sk_date, R.string.twoeuro_comm_2015_sk_abr, R.string.twoeuro_comm_2015_sk_short_title);
        database.add2EuroCoin("si", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_si, R.drawable.twoeuro_comm_2015_si_lightend, R.string.twoeuro_comm_2015_si_title, R.string.twoeuro_comm_2015_si_desc, R.string.twoeuro_comm_2015_si_volume, R.string.twoeuro_comm_2015_si_date, R.string.twoeuro_comm_2015_si_abr, R.string.twoeuro_comm_2015_si_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_sm, R.drawable.twoeuro_comm_2015_sm_lightend, R.string.twoeuro_comm_2015_sm_title, R.string.twoeuro_comm_2015_sm_desc, R.string.twoeuro_comm_2015_sm_volume, R.string.twoeuro_comm_2015_sm_date, R.string.twoeuro_comm_2015_sm_abr, R.string.twoeuro_comm_2015_sm_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2015, R.drawable.twoeuro_comm_2015_sm_2, R.drawable.twoeuro_comm_2015_sm_2_lightend, R.string.twoeuro_comm_2015_sm_2_title, R.string.twoeuro_comm_2015_sm_2_desc, R.string.twoeuro_comm_2015_sm_2_volume, R.string.twoeuro_comm_2015_sm_2_date, R.string.twoeuro_comm_2015_sm_2_abr, R.string.twoeuro_comm_2015_sm_2_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC, 2015, R.drawable.twoeuro_comm_2015_va, R.drawable.twoeuro_comm_2015_va_lightend, R.string.twoeuro_comm_2015_va_title, R.string.twoeuro_comm_2015_va_desc, R.string.twoeuro_comm_2015_va_volume, R.string.twoeuro_comm_2015_va_date, R.string.twoeuro_comm_2015_va_abr, R.string.twoeuro_comm_2015_va_short_title);

        database.add2EuroCoin("au", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_au, R.drawable.twoeuro_comm_2016_au_lightend, R.string.twoeuro_comm_2016_au_title, R.string.twoeuro_comm_2016_au_desc, R.string.twoeuro_comm_2016_au_volume, R.string.twoeuro_comm_2016_au_date, R.string.twoeuro_comm_2016_au_abr, R.string.twoeuro_comm_2016_au_short_title);
        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_be, R.drawable.twoeuro_comm_2016_be_lightend, R.string.twoeuro_comm_2016_be_title, R.string.twoeuro_comm_2016_be_desc, R.string.twoeuro_comm_2016_be_volume, R.string.twoeuro_comm_2016_be_date, R.string.twoeuro_comm_2016_be_abr, R.string.twoeuro_comm_2016_be_short_title);
        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2016, R.drawable.twoeuro_comm_2016_be_2, R.drawable.twoeuro_comm_2016_be_2_lightend, R.string.twoeuro_comm_2016_be_2_title, R.string.twoeuro_comm_2016_be_2_desc, R.string.twoeuro_comm_2016_be_2_volume, R.string.twoeuro_comm_2016_be_2_date, R.string.twoeuro_comm_2016_be_2_abr, R.string.twoeuro_comm_2016_be_2_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_de, R.drawable.twoeuro_comm_2016_de_lightend, R.string.twoeuro_comm_2016_de_title, R.string.twoeuro_comm_2016_de_desc, R.string.twoeuro_comm_2016_de_volume, R.string.twoeuro_comm_2016_de_date, R.string.twoeuro_comm_2016_de_abr, R.string.twoeuro_comm_2016_de_short_title);
        database.add2EuroCoin("ee", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_ee, R.drawable.twoeuro_comm_2016_ee_lightend, R.string.twoeuro_comm_2016_ee_title, R.string.twoeuro_comm_2016_ee_desc, R.string.twoeuro_comm_2016_ee_volume, R.string.twoeuro_comm_2016_ee_date, R.string.twoeuro_comm_2016_ee_abr, R.string.twoeuro_comm_2016_ee_short_title);
        database.add2EuroCoin("es", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_es, R.drawable.twoeuro_comm_2016_es_lightend, R.string.twoeuro_comm_2016_es_title, R.string.twoeuro_comm_2016_es_desc, R.string.twoeuro_comm_2016_es_volume, R.string.twoeuro_comm_2016_es_date, R.string.twoeuro_comm_2016_es_abr, R.string.twoeuro_comm_2016_es_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_fi, R.drawable.twoeuro_comm_2016_fi_lightend, R.string.twoeuro_comm_2016_fi_title, R.string.twoeuro_comm_2016_fi_desc, R.string.twoeuro_comm_2016_fi_volume, R.string.twoeuro_comm_2016_fi_date, R.string.twoeuro_comm_2016_fi_abr, R.string.twoeuro_comm_2016_fi_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2016, R.drawable.twoeuro_comm_2016_fi_2, R.drawable.twoeuro_comm_2016_fi_2_lightend, R.string.twoeuro_comm_2016_fi_2_title, R.string.twoeuro_comm_2016_fi_2_desc, R.string.twoeuro_comm_2016_fi_2_volume, R.string.twoeuro_comm_2016_fi_2_date, R.string.twoeuro_comm_2016_fi_2_abr, R.string.twoeuro_comm_2016_fi_2_short_title);
        database.add2EuroCoin("fr", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_fr, R.drawable.twoeuro_comm_2016_fr_lightend, R.string.twoeuro_comm_2016_fr_title, R.string.twoeuro_comm_2016_fr_desc, R.string.twoeuro_comm_2016_fr_volume, R.string.twoeuro_comm_2016_fr_date, R.string.twoeuro_comm_2016_fr_abr, R.string.twoeuro_comm_2016_fr_short_title);
        database.add2EuroCoin("fr", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2016, R.drawable.twoeuro_comm_2016_fr_2, R.drawable.twoeuro_comm_2016_fr_2_lightend, R.string.twoeuro_comm_2016_fr_2_title, R.string.twoeuro_comm_2016_fr_2_desc, R.string.twoeuro_comm_2016_fr_2_volume, R.string.twoeuro_comm_2016_fr_2_date, R.string.twoeuro_comm_2016_fr_2_abr, R.string.twoeuro_comm_2016_fr_2_short_title);
        database.add2EuroCoin("gr", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_gr, R.drawable.twoeuro_comm_2016_gr_lightend, R.string.twoeuro_comm_2016_gr_title, R.string.twoeuro_comm_2016_gr_desc, R.string.twoeuro_comm_2016_gr_volume, R.string.twoeuro_comm_2016_gr_date, R.string.twoeuro_comm_2016_gr_abr, R.string.twoeuro_comm_2016_gr_short_title);
        database.add2EuroCoin("gr", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2016, R.drawable.twoeuro_comm_2016_gr_2, R.drawable.twoeuro_comm_2016_gr_2_lightend, R.string.twoeuro_comm_2016_gr_2_title, R.string.twoeuro_comm_2016_gr_2_desc, R.string.twoeuro_comm_2016_gr_2_volume, R.string.twoeuro_comm_2016_gr_2_date, R.string.twoeuro_comm_2016_gr_2_abr, R.string.twoeuro_comm_2016_gr_2_short_title);
        database.add2EuroCoin("ir", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_ir, R.drawable.twoeuro_comm_2016_ir_lightend, R.string.twoeuro_comm_2016_ir_title, R.string.twoeuro_comm_2016_ir_desc, R.string.twoeuro_comm_2016_ir_volume, R.string.twoeuro_comm_2016_ir_date, R.string.twoeuro_comm_2016_ir_abr, R.string.twoeuro_comm_2016_ir_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_it, R.drawable.twoeuro_comm_2016_it_lightend, R.string.twoeuro_comm_2016_it_title, R.string.twoeuro_comm_2016_it_desc, R.string.twoeuro_comm_2016_it_volume, R.string.twoeuro_comm_2016_it_date, R.string.twoeuro_comm_2016_it_abr, R.string.twoeuro_comm_2016_it_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2016, R.drawable.twoeuro_comm_2016_it_2, R.drawable.twoeuro_comm_2016_it_2_lightend, R.string.twoeuro_comm_2016_it_2_title, R.string.twoeuro_comm_2016_it_2_desc, R.string.twoeuro_comm_2016_it_2_volume, R.string.twoeuro_comm_2016_it_2_date, R.string.twoeuro_comm_2016_it_2_abr, R.string.twoeuro_comm_2016_it_2_short_title);
        database.add2EuroCoin("lt", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_lt, R.drawable.twoeuro_comm_2016_lt_lightend, R.string.twoeuro_comm_2016_lt_title, R.string.twoeuro_comm_2016_lt_desc, R.string.twoeuro_comm_2016_lt_volume, R.string.twoeuro_comm_2016_lt_date, R.string.twoeuro_comm_2016_lt_abr, R.string.twoeuro_comm_2016_lt_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_lu, R.drawable.twoeuro_comm_2016_lu_lightend, R.string.twoeuro_comm_2016_lu_title, R.string.twoeuro_comm_2016_lu_desc, R.string.twoeuro_comm_2016_lu_volume, R.string.twoeuro_comm_2016_lu_date, R.string.twoeuro_comm_2016_lu_abr, R.string.twoeuro_comm_2016_lu_short_title);
        database.add2EuroCoin("lv", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_lv, R.drawable.twoeuro_comm_2016_lv_lightend, R.string.twoeuro_comm_2016_lv_title, R.string.twoeuro_comm_2016_lv_desc, R.string.twoeuro_comm_2016_lv_volume, R.string.twoeuro_comm_2016_lv_date, R.string.twoeuro_comm_2016_lv_abr, R.string.twoeuro_comm_2016_lv_short_title);
        database.add2EuroCoin("lv", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2016, R.drawable.twoeuro_comm_2016_lv_2, R.drawable.twoeuro_comm_2016_lv_2_lightend, R.string.twoeuro_comm_2016_lv_2_title, R.string.twoeuro_comm_2016_lv_2_desc, R.string.twoeuro_comm_2016_lv_2_volume, R.string.twoeuro_comm_2016_lv_2_date, R.string.twoeuro_comm_2016_lv_2_abr, R.string.twoeuro_comm_2016_lv_2_short_title);
        database.add2EuroCoin("mc", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_mo, R.drawable.twoeuro_comm_2016_mo_lightend, R.string.twoeuro_comm_2016_mo_title, R.string.twoeuro_comm_2016_mo_desc, R.string.twoeuro_comm_2016_mo_volume, R.string.twoeuro_comm_2016_mo_date, R.string.twoeuro_comm_2016_mo_abr, R.string.twoeuro_comm_2016_mo_short_title);
        database.add2EuroCoin("mt", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_mt, R.drawable.twoeuro_comm_2016_mt_lightend, R.string.twoeuro_comm_2016_mt_title, R.string.twoeuro_comm_2016_mt_desc, R.string.twoeuro_comm_2016_mt_volume, R.string.twoeuro_comm_2016_mt_date, R.string.twoeuro_comm_2016_mt_abr, R.string.twoeuro_comm_2016_mt_short_title);
        database.add2EuroCoin("po", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_po, R.drawable.twoeuro_comm_2016_po_lightend, R.string.twoeuro_comm_2016_po_title, R.string.twoeuro_comm_2016_po_desc, R.string.twoeuro_comm_2016_po_volume, R.string.twoeuro_comm_2016_po_date, R.string.twoeuro_comm_2016_po_abr, R.string.twoeuro_comm_2016_po_short_title);
        database.add2EuroCoin("po", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2016, R.drawable.twoeuro_comm_2016_po_2, R.drawable.twoeuro_comm_2016_po_2_lightend, R.string.twoeuro_comm_2016_po_2_title, R.string.twoeuro_comm_2016_po_2_desc, R.string.twoeuro_comm_2016_po_2_volume, R.string.twoeuro_comm_2016_po_2_date, R.string.twoeuro_comm_2016_po_2_abr, R.string.twoeuro_comm_2016_po_2_short_title);
        database.add2EuroCoin("si", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_si, R.drawable.twoeuro_comm_2016_si_lightend, R.string.twoeuro_comm_2016_si_title, R.string.twoeuro_comm_2016_si_desc, R.string.twoeuro_comm_2016_si_volume, R.string.twoeuro_comm_2016_si_date, R.string.twoeuro_comm_2016_si_abr, R.string.twoeuro_comm_2016_si_short_title);
        database.add2EuroCoin("sk", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_sk, R.drawable.twoeuro_comm_2016_sk_lightend, R.string.twoeuro_comm_2016_sk_title, R.string.twoeuro_comm_2016_sk_desc, R.string.twoeuro_comm_2016_sk_volume, R.string.twoeuro_comm_2016_sk_date, R.string.twoeuro_comm_2016_sk_abr, R.string.twoeuro_comm_2016_sk_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_sm, R.drawable.twoeuro_comm_2016_sm_lightend, R.string.twoeuro_comm_2016_sm_title, R.string.twoeuro_comm_2016_sm_desc, R.string.twoeuro_comm_2016_sm_volume, R.string.twoeuro_comm_2016_sm_date, R.string.twoeuro_comm_2016_sm_abr, R.string.twoeuro_comm_2016_sm_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2016, R.drawable.twoeuro_comm_2016_sm_2, R.drawable.twoeuro_comm_2016_sm_2_lightend, R.string.twoeuro_comm_2016_sm_2_title, R.string.twoeuro_comm_2016_sm_2_desc, R.string.twoeuro_comm_2016_sm_2_volume, R.string.twoeuro_comm_2016_sm_2_date, R.string.twoeuro_comm_2016_sm_2_abr, R.string.twoeuro_comm_2016_sm_2_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC, 2016, R.drawable.twoeuro_comm_2016_va, R.drawable.twoeuro_comm_2016_va_lightend, R.string.twoeuro_comm_2016_va_title, R.string.twoeuro_comm_2016_va_desc, R.string.twoeuro_comm_2016_va_volume, R.string.twoeuro_comm_2016_va_date, R.string.twoeuro_comm_2016_va_abr, R.string.twoeuro_comm_2016_va_short_title);
        database.add2EuroCoin("va", SpecialEuroCoin.COMMON_TITLE_2CC_2, 2016, R.drawable.twoeuro_comm_2016_va_2, R.drawable.twoeuro_comm_2016_va_2_lightend, R.string.twoeuro_comm_2016_va_2_title, R.string.twoeuro_comm_2016_va_2_desc, R.string.twoeuro_comm_2016_va_2_volume, R.string.twoeuro_comm_2016_va_2_date, R.string.twoeuro_comm_2016_va_2_abr, R.string.twoeuro_comm_2016_va_2_short_title);

        database.add2EuroCoin("be", SpecialEuroCoin.COMMON_TITLE_2CC, 2017, R.drawable.twoeuro_comm_2017_be, R.drawable.twoeuro_comm_2017_be_lightend, R.string.twoeuro_comm_2017_be_title, R.string.twoeuro_comm_2017_be_desc, R.string.twoeuro_comm_2017_be_volume, R.string.twoeuro_comm_2017_be_date, R.string.twoeuro_comm_2017_be_abr, R.string.twoeuro_comm_2017_be_short_title);
        database.add2EuroCoin("de", SpecialEuroCoin.COMMON_TITLE_2CC, 2017, R.drawable.twoeuro_comm_2017_de, R.drawable.twoeuro_comm_2017_de_lightend, R.string.twoeuro_comm_2017_de_title, R.string.twoeuro_comm_2017_de_desc, R.string.twoeuro_comm_2017_de_volume, R.string.twoeuro_comm_2017_de_date, R.string.twoeuro_comm_2017_de_abr, R.string.twoeuro_comm_2017_de_short_title);
        database.add2EuroCoin("es", SpecialEuroCoin.COMMON_TITLE_2CC, 2017, R.drawable.twoeuro_comm_2017_es, R.drawable.twoeuro_comm_2017_es_lightend, R.string.twoeuro_comm_2017_es_title, R.string.twoeuro_comm_2017_es_desc, R.string.twoeuro_comm_2017_es_volume, R.string.twoeuro_comm_2017_es_date, R.string.twoeuro_comm_2017_es_abr, R.string.twoeuro_comm_2017_es_short_title);
        database.add2EuroCoin("fi", SpecialEuroCoin.COMMON_TITLE_2CC, 2017, R.drawable.twoeuro_comm_2017_fi, R.drawable.twoeuro_comm_2017_fi_lightend, R.string.twoeuro_comm_2017_fi_title, R.string.twoeuro_comm_2017_fi_desc, R.string.twoeuro_comm_2017_fi_volume, R.string.twoeuro_comm_2017_fi_date, R.string.twoeuro_comm_2017_fi_abr, R.string.twoeuro_comm_2017_fi_short_title);
        database.add2EuroCoin("fr", SpecialEuroCoin.COMMON_TITLE_2CC, 2017, R.drawable.twoeuro_comm_2017_fr, R.drawable.twoeuro_comm_2017_fr_lightend, R.string.twoeuro_comm_2017_fr_title, R.string.twoeuro_comm_2017_fr_desc, R.string.twoeuro_comm_2017_fr_volume, R.string.twoeuro_comm_2017_fr_date, R.string.twoeuro_comm_2017_fr_abr, R.string.twoeuro_comm_2017_fr_short_title);
        database.add2EuroCoin("it", SpecialEuroCoin.COMMON_TITLE_2CC, 2017, R.drawable.twoeuro_comm_2017_it, R.drawable.twoeuro_comm_2017_it_lightend, R.string.twoeuro_comm_2017_it_title, R.string.twoeuro_comm_2017_it_desc, R.string.twoeuro_comm_2017_it_volume, R.string.twoeuro_comm_2017_it_date, R.string.twoeuro_comm_2017_it_abr, R.string.twoeuro_comm_2017_it_short_title);
        database.add2EuroCoin("lu", SpecialEuroCoin.COMMON_TITLE_2CC, 2017, R.drawable.twoeuro_comm_2017_lu, R.drawable.twoeuro_comm_2017_lu_lightend, R.string.twoeuro_comm_2017_lu_title, R.string.twoeuro_comm_2017_lu_desc, R.string.twoeuro_comm_2017_lu_volume, R.string.twoeuro_comm_2017_lu_date, R.string.twoeuro_comm_2017_lu_abr, R.string.twoeuro_comm_2017_lu_short_title);
        database.add2EuroCoin("sm", SpecialEuroCoin.COMMON_TITLE_2CC, 2017, R.drawable.twoeuro_comm_2017_sm, R.drawable.twoeuro_comm_2017_sm_lightend, R.string.twoeuro_comm_2017_sm_title, R.string.twoeuro_comm_2017_sm_desc, R.string.twoeuro_comm_2017_sm_volume, R.string.twoeuro_comm_2017_sm_date, R.string.twoeuro_comm_2017_sm_abr, R.string.twoeuro_comm_2017_sm_short_title);
        database.add2EuroCoin("si", SpecialEuroCoin.COMMON_TITLE_2CC, 2017, R.drawable.twoeuro_comm_2017_si, R.drawable.twoeuro_comm_2017_si_lightend, R.string.twoeuro_comm_2017_si_title, R.string.twoeuro_comm_2017_si_desc, R.string.twoeuro_comm_2017_si_volume, R.string.twoeuro_comm_2017_si_date, R.string.twoeuro_comm_2017_si_abr, R.string.twoeuro_comm_2017_si_short_title);
        database.add2EuroCoin("sk", SpecialEuroCoin.COMMON_TITLE_2CC, 2017, R.drawable.twoeuro_comm_2017_sk, R.drawable.twoeuro_comm_2017_sk_lightend, R.string.twoeuro_comm_2017_sk_title, R.string.twoeuro_comm_2017_sk_desc, R.string.twoeuro_comm_2017_sk_volume, R.string.twoeuro_comm_2017_sk_date, R.string.twoeuro_comm_2017_sk_abr, R.string.twoeuro_comm_2017_sk_short_title);

        // public ArrayList<SpecialEuroCoin> add2EuroCoinEU(String coinTitleID, int year, int imgResId, int imgResIdLightend, int titleResId, int descResId, int volumeResId, int dateResId, int abrevationResId, int shortTitleResId, Collection<Country> noMintCountries)
        database.add2EuroCoinEU(SpecialEuroCoin.COMMON_TITLE_2CC_RV, 2007, R.drawable.twoeuro_comm_2007_eu_rv, R.drawable.twoeuro_comm_2007_eu_rv_lightend, R.string.twoeuro_comm_2007_eu_rv_title, R.string.twoeuro_comm_2007_eu_rv_desc, R.string.twoeuro_comm_2007_eu_rv_volume, R.string.twoeuro_comm_2007_eu_rv_date, R.string.twoeuro_comm_2007_eu_rv_abr, R.string.twoeuro_comm_2007_eu_rv_short_title, CoinHelper.toArrayList(Countries.country_andorra, Countries.country_monaco, Countries.country_sanmarino, Countries.country_vatican));
        database.add2EuroCoinEU(SpecialEuroCoin.COMMON_TITLE_2CC_EMU, 2009, R.drawable.twoeuro_comm_2009_eu_emu, R.drawable.twoeuro_comm_2009_eu_emu_lightend, R.string.twoeuro_comm_2009_eu_emu_title, R.string.twoeuro_comm_2009_eu_emu_desc, R.string.twoeuro_comm_2009_eu_emu_volume, R.string.twoeuro_comm_2009_eu_emu_date, R.string.twoeuro_comm_2009_eu_emu_abr, R.string.twoeuro_comm_2009_eu_emu_short_title, CoinHelper.toArrayList(Countries.country_andorra, Countries.country_monaco, Countries.country_vatican));
        database.add2EuroCoinEU(SpecialEuroCoin.COMMON_TITLE_2CC_BG, 2012, R.drawable.twoeuro_comm_2012_eu_bg, R.drawable.twoeuro_comm_2012_eu_bg_lightend, R.string.twoeuro_comm_2012_eu_bg_title, R.string.twoeuro_comm_2012_eu_bg_desc, R.string.twoeuro_comm_2012_eu_bg_volume, R.string.twoeuro_comm_2012_eu_bg_date, R.string.twoeuro_comm_2012_eu_bg_abr, R.string.twoeuro_comm_2012_eu_bg_short_title, CoinHelper.toArrayList(Countries.country_andorra, Countries.country_monaco, Countries.country_sanmarino, Countries.country_vatican));
        database.add2EuroCoinEU(SpecialEuroCoin.COMMON_TITLE_2CC_EUF, 2015, R.drawable.twoeuro_comm_2015_eu_euf, R.drawable.twoeuro_comm_2015_eu_euf_lightend, R.string.twoeuro_comm_2015_eu_euf_title, R.string.twoeuro_comm_2015_eu_euf_desc, R.string.twoeuro_comm_2015_eu_euf_volume, R.string.twoeuro_comm_2015_eu_euf_date, R.string.twoeuro_comm_2015_eu_euf_abr, R.string.twoeuro_comm_2015_eu_euf_short_title, CoinHelper.toArrayList(Countries.country_andorra, Countries.country_monaco, Countries.country_sanmarino, Countries.country_vatican));
    }

    public static void addOtherEuroCommemorativeCoins(Database database) {
        // public ArrayList<SpecialEuroCoin> addSpecialEuroCoin(String countryCode, String coinTitleID, int year, int value, boolean is2EuroCC, int imgResId, int imgResIdLightend, int titleResId, int descResId, int volumeResId, int dateResId, int abrevationResId, int shortTitleResId)
        database.addSpecialEuroCoin("de", SpecialEuroCoin.ID_BLUE_PLANET, 2016, 500, false, R.drawable.specialeuro_2016_de_planet, R.drawable.specialeuro_2016_de_planet_lightend, R.string.specialeuro_2016_de_planet_title, 0, 0, 0, R.string.specialeuro_2016_de_planet_abr, R.string.specialeuro_2016_de_planet_short_title);
        database.addSpecialEuroCoin("de", SpecialEuroCoin.ID_RED_CLIMA, 2017, 500, false, R.drawable.specialeuro_2017_de_clima, R.drawable.specialeuro_2017_de_clima_lightend, R.string.specialeuro_2017_de_clima_title, 0, 0, 0, R.string.specialeuro_2017_de_clima_abr, R.string.specialeuro_2017_de_clima_short_title);
    }

    public static void setRareCoins(Database database) {
        // public void setRare(Country country, int year, int ... coinIdxs)
        // public void setRare(Country country, String commonTitle, int year, int ... coinIdxs) {
        // 0=1ct, 1=2ct, 2=5ct, 3=10ct, 4=20ct, 5=50ct, 6=1€, 7=2€
        database.setRare(Countries.country_belgium, 1999, 1, 4, 7);
        database.setRare(Countries.country_belgium, 2000, 0, 2, 3, 5, 6);
        database.setRare(Countries.country_belgium, 2001, 1, 2, 4, 5, 6, 7);
        database.setRare(Countries.country_belgium, 2002, 0, 1, 2);
        database.setRare(Countries.country_belgium, 2003, 3, 5);
        database.setRare(Countries.country_belgium, 2005, 0, 1, 5, 6);
        database.setRare(Countries.country_belgium, 2006, 3, 5, 6);
        database.setRare(Countries.country_belgium, 2007, 2, 3, 6);
        database.setRare(Countries.country_belgium, 2008, 0, 1, 2, 3);
        database.setRare(Countries.country_belgium, 2009, 2, 3);
        database.setRare(Countries.country_belgium, 2010, 5, 6);
        database.setRare(Countries.country_belgium, 2011, 1);
        database.setRare(Countries.country_belgium, 2012, 7);
        database.setRare(Countries.country_belgium, 2013, 4, 5, 6, 7);
        database.setRare(Countries.country_belgium, 2014, 3, 4, 6, 7);
        database.setRare(Countries.country_germany, "A", 2003, 0, 2, 5);
        database.setRare(Countries.country_germany, "D", 2003, 0, 2, 6);
        database.setRare(Countries.country_germany, "F", 2003, 0, 2, 5, 6);
        database.setRare(Countries.country_germany, "G", 2003, 0, 2, 5, 6);
        database.setRare(Countries.country_germany, "J", 2003, 0, 2, 4);
        database.setRare(Countries.country_germany, "A", 2004, 3, 4);
        database.setRare(Countries.country_germany, "D", 2004, 5);
        database.setRare(Countries.country_germany, "F", 2004, 4, 7);
        database.setRare(Countries.country_germany, "G", 2004, 4, 7);
        database.setRare(Countries.country_germany, "J", 2004, 3, 4, 5, 6);
        database.setRare(Countries.country_germany, "A", 2005, 3, 5, 6, 7);
        database.setRare(Countries.country_germany, "D", 2005, 3, 5, 6, 7);
        database.setRare(Countries.country_germany, "F", 2005, 3, 5, 6, 7);
        database.setRare(Countries.country_germany, "G", 2005, 3, 5, 6, 7);
        database.setRare(Countries.country_germany, "J", 2005, 3, 5, 7);
        database.setRare(Countries.country_germany, "A", 2006, 0, 3, 5, 6, 7);
        database.setRare(Countries.country_germany, "D", 2006, 0, 3, 5, 6, 7);
        database.setRare(Countries.country_germany, "F", 2006, 0, 3, 5, 6, 7);
        database.setRare(Countries.country_germany, "G", 2006, 0, 3, 5, 6, 7);
        database.setRare(Countries.country_germany, "J", 2006, 0, 3, 5, 6, 7);
        database.setRare(Countries.country_germany, "A", 2007, 3, 5, 6);
        database.setRare(Countries.country_germany, "D", 2007, 3, 5, 6);
        database.setRare(Countries.country_germany, "F", 2007, 3, 5, 6);
        database.setRare(Countries.country_germany, "G", 2007, 3, 5, 6);
        database.setRare(Countries.country_germany, "J", 2007, 3, 5, 6);
        database.setRare(Countries.country_germany, "A", 2008, 3, 5, 6);
        database.setRare(Countries.country_germany, "D", 2008, 3, 5, 6);
        database.setRare(Countries.country_germany, "F", 2008, 3, 5, 6);
        database.setRare(Countries.country_germany, "G", 2008, 3, 5, 6);
        database.setRare(Countries.country_germany, "J", 2008, 3, 5, 6);
        database.setRare(Countries.country_germany, "A", 2009, 3, 5, 6);
        database.setRare(Countries.country_germany, "D", 2009, 3, 5, 6);
        database.setRare(Countries.country_germany, "F", 2009, 3, 5, 6);
        database.setRare(Countries.country_germany, "G", 2009, 3, 5, 6);
        database.setRare(Countries.country_germany, "J", 2009, 3, 5, 6);
        database.setRare(Countries.country_germany, "A", 2010, 3, 5, 6);
        database.setRare(Countries.country_germany, "D", 2010, 3, 5, 6);
        database.setRare(Countries.country_germany, "F", 2010, 3, 5, 6);
        database.setRare(Countries.country_germany, "G", 2010, 3, 5, 6);
        database.setRare(Countries.country_germany, "J", 2010, 3, 5, 6);
        database.setRare(Countries.country_germany, "A", 2011, 3, 5, 6);
        database.setRare(Countries.country_germany, "D", 2011, 3, 5, 6);
        database.setRare(Countries.country_germany, "F", 2011, 3, 5, 6);
        database.setRare(Countries.country_germany, "G", 2011, 3, 5, 6);
        database.setRare(Countries.country_germany, "J", 2011, 3, 5, 6);
        database.setRare(Countries.country_germany, "A", 2012, 3, 5, 6);
        database.setRare(Countries.country_germany, "D", 2012, 3, 5, 6);
        database.setRare(Countries.country_germany, "F", 2012, 3, 5, 6);
        database.setRare(Countries.country_germany, "G", 2012, 3, 5, 6);
        database.setRare(Countries.country_germany, "J", 2012, 3, 5, 6);
        database.setRare(Countries.country_germany, "A", 2013, 3, 5, 6);
        database.setRare(Countries.country_germany, "D", 2013, 3, 5, 6);
        database.setRare(Countries.country_germany, "F", 2013, 3, 5, 6);
        database.setRare(Countries.country_germany, "G", 2013, 3, 5, 6);
        database.setRare(Countries.country_germany, "J", 2013, 3, 5, 6);
        database.setRare(Countries.country_germany, "A", 2014, 3, 5, 6);
        database.setRare(Countries.country_germany, "D", 2014, 3, 5, 6);
        database.setRare(Countries.country_germany, "F", 2014, 3, 5, 6);
        database.setRare(Countries.country_germany, "G", 2014, 3, 5, 6);
        database.setRare(Countries.country_germany, "J", 2014, 3, 5, 6);
        database.setRare(Countries.country_germany, "A", 2015, 3, 5, 6);
        database.setRare(Countries.country_germany, "D", 2015, 3, 5, 6);
        database.setRare(Countries.country_germany, "F", 2015, 3, 5, 6);
        database.setRare(Countries.country_germany, "G", 2015, 3, 5, 6);
        database.setRare(Countries.country_germany, "J", 2015, 3, 5, 6);
        database.setRare(Countries.country_germany, "A", 2016, 3, 5, 6);
        database.setRare(Countries.country_germany, "D", 2016, 3, 5, 6);
        database.setRare(Countries.country_germany, "F", 2016, 3, 5, 6);
        database.setRare(Countries.country_germany, "G", 2016, 3, 5, 6);
        database.setRare(Countries.country_germany, "J", 2016, 3, 5, 6);
        database.setRare(Countries.country_france, 2002, 0, 1);
        database.setRare(Countries.country_france, 2003, 4, 5, 6, 7);
        database.setRare(Countries.country_france, 2004, 4, 5, 6, 7);
        database.setRare(Countries.country_france, 2005, 4, 5, 6, 7);
        database.setRare(Countries.country_france, 2006, 4, 5, 6, 7);
        database.setRare(Countries.country_france, 2007, 5, 6, 7);
        database.setRare(Countries.country_france, 2008, 5, 6, 7);
        database.setRare(Countries.country_france, 2009, 5, 6, 7);
        database.setRare(Countries.country_france, 2010, 5, 6, 7);
        database.setRare(Countries.country_france, 2011, 5, 6);
        database.setRare(Countries.country_france, 2012, 4, 5, 6);
        database.setRare(Countries.country_france, 2013, 5, 6);
        database.setRare(Countries.country_greece, 2004, 7);
        database.setRare(Countries.country_greece, 2007, 7);
        database.setRare(Countries.country_greece, 2011, 7);
        database.setRare(Countries.country_greece, 2012, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_greece, 2013, 2, 4, 5, 6, 7);
        database.setRare(Countries.country_greece, 2014, 4, 5, 6, 7);
        database.setRare(Countries.country_malta, 2011, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_malta, 2012, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_malta, 2013, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_malta, 2014, 3, 4, 6);
        database.setRare(Countries.country_monaco, 2009, 0, 1, 2, 3, 4, 5, 6);
        database.setRare(Countries.country_monaco, 2010, 7);
        database.setRare(Countries.country_monaco, 2011, 0, 1, 2, 3, 4, 5, 6);
        database.setRare(Countries.country_monaco, 2013, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_austria, 2012, 5, 6);
        database.setRare(Countries.country_portugal, 2003, 0, 1, 2);
        database.setRare(Countries.country_portugal, 2007, 3, 4, 5, 7);
        database.setRare(Countries.country_portugal, 2008, 7);
        database.setRare(Countries.country_portugal, 2009, 7);
        database.setRare(Countries.country_portugal, 2010, 3, 7);
        database.setRare(Countries.country_portugal, 2011, 3, 5, 7);
        database.setRare(Countries.country_portugal, 2012, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_portugal, 2013, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_portugal, 2014, 2, 3, 4, 5, 7);
        database.setRare(Countries.country_slovakia, 2010, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_slovakia, 2011, 2, 3, 4, 5, 6);
        database.setRare(Countries.country_slovakia, 2012, 1, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_slovakia, 2013, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_slovenia, 2008, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_slovenia, 2009, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_slovenia, 2010, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_slovenia, 2011, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_slovenia, 2012, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_slovenia, 2013, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setRare(Countries.country_slovenia, 2014, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    public static void setNotExistingCoins(Database database) {
        // public void setNotExists(Country country, String commonTitle, int year, int ... coinIdxs) {
        // public void setNotExists(Country country, int year, int ... coinIdxs) {
        database.setNotExists(Countries.country_germany, "A", 2007, 7);
        database.setNotExists(Countries.country_germany, "D", 2007, 7);
        database.setNotExists(Countries.country_germany, "F", 2007, 7);
        database.setNotExists(Countries.country_germany, "G", 2007, 7);
        database.setNotExists(Countries.country_germany, "J", 2007, 7);
        database.setNotExists(Countries.country_germany, "A", 2009, 7);
        database.setNotExists(Countries.country_germany, "D", 2009, 7);
        database.setNotExists(Countries.country_germany, "F", 2009, 7);
        database.setNotExists(Countries.country_germany, "G", 2009, 7);
        database.setNotExists(Countries.country_germany, "J", 2009, 7);
        database.setNotExists(Countries.country_germany, "A", 2012, 7);
        database.setNotExists(Countries.country_germany, "D", 2012, 7);
        database.setNotExists(Countries.country_germany, "F", 2012, 7);
        database.setNotExists(Countries.country_germany, "G", 2012, 7);
        database.setNotExists(Countries.country_germany, "J", 2012, 7);
        database.setNotExists(Countries.country_germany, "A", 2013, 7);
        database.setNotExists(Countries.country_germany, "D", 2013, 7);
        database.setNotExists(Countries.country_germany, "F", 2013, 7);
        database.setNotExists(Countries.country_germany, "G", 2013, 7);
        database.setNotExists(Countries.country_germany, "J", 2013, 7);
        database.setNotExists(Countries.country_germany, "A", 2015, 7);
        database.setNotExists(Countries.country_germany, "D", 2015, 7);
        database.setNotExists(Countries.country_germany, "F", 2015, 7);
        database.setNotExists(Countries.country_germany, "G", 2015, 7);
        database.setNotExists(Countries.country_germany, "J", 2015, 7);
        database.setNotExists(Countries.country_estonia, 2012, 2, 3, 4, 5, 6, 7);
        database.setNotExists(Countries.country_estonia, 2013, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setNotExists(Countries.country_malta, 2009, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setNotExists(Countries.country_malta, 2010, 0, 1, 2, 3, 4, 5, 6);
        database.setNotExists(Countries.country_monaco, 2003, 0, 1, 2);
        database.setNotExists(Countries.country_monaco, 2005, 3, 4, 5, 6, 7);
        database.setNotExists(Countries.country_monaco, 2007, 0, 1, 2, 3, 4, 5, 7);
        database.setNotExists(Countries.country_monaco, 2008, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setNotExists(Countries.country_monaco, 2010, 0, 1, 2, 3, 4, 5, 6);
        database.setNotExists(Countries.country_monaco, 2012, 0, 1, 2, 3, 4, 5, 6);
        database.setNotExists(Countries.country_austria, 2005, 7);
        database.setNotExists(Countries.country_austria, 2007, 7);
        database.setNotExists(Countries.country_austria, 2009, 7);
        database.setNotExists(Countries.country_estonia, 2014, 0, 1, 2, 3, 4, 5, 6, 7);
        database.setNotExists(Countries.country_estonia, 2015, 2, 3, 4, 5, 6, 7);
    }

    public static ArrayList<int[][]> getCoinImages(Country country, int year, boolean fillSeries) {
        String countrycode = country.getCountryCode();
        ArrayList<int[][]> coinSetResId = new ArrayList<int[][]>();
        int[][] coinResIds = new int[CoinSet.COINS_PER_SET_STD][2];

        if (countrycode.equals(Countries.country_EU.getCountryCode())) {
            // EU is the only view which has 9 STD coins instead of 8 because of the commemorative ones
            coinResIds = new int[CoinSet.COINS_PER_SET_STD + 1][2];

            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_common_10cent;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_common_1cent;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_common_1euro;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_common_20cent;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_common_2cent;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_common_2euro;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_common_50cent;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_common_5cent;
            coinResIds[8][0] = R.drawable.euro_muenze_rs_common_2euro;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_common_10cent_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_common_1cent_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_common_1euro_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_common_20cent_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_common_2cent_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_common_2euro_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_common_50cent_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_common_5cent_lightend;
            coinResIds[8][1] = R.drawable.euro_muenze_rs_common_2euro_lightend;

        } else if (countrycode.equals(Countries.country_belgium.getCountryCode())) {
            if (year >= 2014) {
                if (fillSeries) {
                    country.addSeries(2014, null);
                }
                coinResIds[3][0] = R.drawable.euro_muenze_rs_be_10c_3;
                coinResIds[0][0] = R.drawable.euro_muenze_rs_be_1c_3;
                coinResIds[6][0] = R.drawable.euro_muenze_rs_be_1e_3;
                coinResIds[4][0] = R.drawable.euro_muenze_rs_be_20c_3;
                coinResIds[1][0] = R.drawable.euro_muenze_rs_be_2c_3;
                coinResIds[7][0] = R.drawable.euro_muenze_rs_be_2e_3;
                coinResIds[5][0] = R.drawable.euro_muenze_rs_be_50c_3;
                coinResIds[2][0] = R.drawable.euro_muenze_rs_be_5c_3;

                coinResIds[3][1] = R.drawable.euro_muenze_rs_be_10c_3_lightend;
                coinResIds[0][1] = R.drawable.euro_muenze_rs_be_1c_3_lightend;
                coinResIds[6][1] = R.drawable.euro_muenze_rs_be_1e_3_lightend;
                coinResIds[4][1] = R.drawable.euro_muenze_rs_be_20c_3_lightend;
                coinResIds[1][1] = R.drawable.euro_muenze_rs_be_2c_3_lightend;
                coinResIds[7][1] = R.drawable.euro_muenze_rs_be_2e_3_lightend;
                coinResIds[5][1] = R.drawable.euro_muenze_rs_be_50c_3_lightend;
                coinResIds[2][1] = R.drawable.euro_muenze_rs_be_5c_3_lightend;
            } else if (year >= 2008) {
                if (fillSeries) {
                    country.addSeries(2008, null);
                }
                coinResIds[3][0] = R.drawable.euro_muenze_rs_be_10c_2;
                coinResIds[0][0] = R.drawable.euro_muenze_rs_be_1c_2;
                coinResIds[6][0] = R.drawable.euro_muenze_rs_be_1e_2;
                coinResIds[4][0] = R.drawable.euro_muenze_rs_be_20c_2;
                coinResIds[1][0] = R.drawable.euro_muenze_rs_be_2c_2;
                coinResIds[7][0] = R.drawable.euro_muenze_rs_be_2e_2;
                coinResIds[5][0] = R.drawable.euro_muenze_rs_be_50c_2;
                coinResIds[2][0] = R.drawable.euro_muenze_rs_be_5c_2;

                coinResIds[3][1] = R.drawable.euro_muenze_rs_be_10c_2_lightend;
                coinResIds[0][1] = R.drawable.euro_muenze_rs_be_1c_2_lightend;
                coinResIds[6][1] = R.drawable.euro_muenze_rs_be_1e_2_lightend;
                coinResIds[4][1] = R.drawable.euro_muenze_rs_be_20c_2_lightend;
                coinResIds[1][1] = R.drawable.euro_muenze_rs_be_2c_2_lightend;
                coinResIds[7][1] = R.drawable.euro_muenze_rs_be_2e_2_lightend;
                coinResIds[5][1] = R.drawable.euro_muenze_rs_be_50c_2_lightend;
                coinResIds[2][1] = R.drawable.euro_muenze_rs_be_5c_2_lightend;
            } else {
                if (fillSeries) {
                    country.addSeries(country.getStartYear(), null);
                }
                coinResIds[3][0] = R.drawable.euro_muenze_rs_be_10c;
                coinResIds[0][0] = R.drawable.euro_muenze_rs_be_1c;
                coinResIds[6][0] = R.drawable.euro_muenze_rs_be_1e;
                coinResIds[4][0] = R.drawable.euro_muenze_rs_be_20c;
                coinResIds[1][0] = R.drawable.euro_muenze_rs_be_2c;
                coinResIds[7][0] = R.drawable.euro_muenze_rs_be_2e;
                coinResIds[5][0] = R.drawable.euro_muenze_rs_be_50c;
                coinResIds[2][0] = R.drawable.euro_muenze_rs_be_5c;

                coinResIds[3][1] = R.drawable.euro_muenze_rs_be_10c_lightend;
                coinResIds[0][1] = R.drawable.euro_muenze_rs_be_1c_lightend;
                coinResIds[6][1] = R.drawable.euro_muenze_rs_be_1e_lightend;
                coinResIds[4][1] = R.drawable.euro_muenze_rs_be_20c_lightend;
                coinResIds[1][1] = R.drawable.euro_muenze_rs_be_2c_lightend;
                coinResIds[7][1] = R.drawable.euro_muenze_rs_be_2e_lightend;
                coinResIds[5][1] = R.drawable.euro_muenze_rs_be_50c_lightend;
                coinResIds[2][1] = R.drawable.euro_muenze_rs_be_5c_lightend;
            }
        } else if (countrycode.equals(Countries.country_germany.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_de_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_de_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_de_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_de_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_de_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_de_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_de_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_de_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_de_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_de_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_de_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_de_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_de_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_de_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_de_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_de_5c_lightend;
        } else if (countrycode.equals(Countries.country_estonia.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_et_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_et_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_et_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_et_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_et_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_et_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_et_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_et_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_et_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_et_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_et_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_et_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_et_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_et_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_et_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_et_5c_lightend;
        } else if (countrycode.equals(Countries.country_finland.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_fi_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_fi_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_fi_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_fi_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_fi_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_fi_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_fi_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_fi_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_fi_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_fi_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_fi_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_fi_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_fi_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_fi_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_fi_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_fi_5c_lightend;
        } else if (countrycode.equals(Countries.country_france.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_fr_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_fr_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_fr_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_fr_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_fr_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_fr_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_fr_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_fr_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_fr_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_fr_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_fr_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_fr_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_fr_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_fr_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_fr_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_fr_5c_lightend;
        } else if (countrycode.equals(Countries.country_greece.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_gr_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_gr_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_gr_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_gr_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_gr_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_gr_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_gr_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_gr_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_gr_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_gr_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_gr_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_gr_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_gr_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_gr_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_gr_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_gr_5c_lightend;
        } else if (countrycode.equals(Countries.country_ireland.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_ir_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_ir_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_ir_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_ir_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_ir_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_ir_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_ir_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_ir_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_ir_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_ir_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_ir_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_ir_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_ir_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_ir_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_ir_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_ir_5c_lightend;
        } else if (countrycode.equals(Countries.country_italy.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_it_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_it_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_it_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_it_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_it_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_it_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_it_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_it_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_it_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_it_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_it_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_it_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_it_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_it_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_it_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_it_5c_lightend;
        } else if (countrycode.equals(Countries.country_lithuania.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_lt_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_lt_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_lt_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_lt_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_lt_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_lt_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_lt_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_lt_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_lt_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_lt_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_lt_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_lt_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_lt_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_lt_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_lt_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_lt_5c_lightend;
        } else if (countrycode.equals(Countries.country_luxembourg.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_lu_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_lu_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_lu_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_lu_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_lu_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_lu_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_lu_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_lu_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_lu_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_lu_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_lu_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_lu_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_lu_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_lu_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_lu_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_lu_5c_lightend;
        } else if (countrycode.equals(Countries.country_latvia.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_lv_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_lv_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_lv_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_lv_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_lv_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_lv_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_lv_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_lv_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_lv_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_lv_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_lv_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_lv_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_lv_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_lv_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_lv_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_lv_5c_lightend;
        } else if (countrycode.equals(Countries.country_malta.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_mt_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_mt_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_mt_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_mt_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_mt_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_mt_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_mt_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_mt_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_mt_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_mt_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_mt_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_mt_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_mt_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_mt_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_mt_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_mt_5c_lightend;
        } else if (countrycode.equals(Countries.country_monaco.getCountryCode())) {
            if (year >= 2006) {
                if (fillSeries) {
                    country.addSeries(2006, null);
                }
                coinResIds[3][0] = R.drawable.euro_muenze_rs_mc_10c_2ser;
                coinResIds[0][0] = R.drawable.euro_muenze_rs_mc_1c_2ser;
                coinResIds[6][0] = R.drawable.euro_muenze_rs_mc_1e_2ser;
                coinResIds[4][0] = R.drawable.euro_muenze_rs_mc_20c_2ser;
                coinResIds[1][0] = R.drawable.euro_muenze_rs_mc_2c_2ser;
                coinResIds[7][0] = R.drawable.euro_muenze_rs_mc_2e_2ser;
                coinResIds[5][0] = R.drawable.euro_muenze_rs_mc_50c_2ser;
                coinResIds[2][0] = R.drawable.euro_muenze_rs_mc_5c_2ser;

                coinResIds[3][1] = R.drawable.euro_muenze_rs_mc_10c_2ser_lightend;
                coinResIds[0][1] = R.drawable.euro_muenze_rs_mc_1c_2ser_lightend;
                coinResIds[6][1] = R.drawable.euro_muenze_rs_mc_1e_2ser_lightend;
                coinResIds[4][1] = R.drawable.euro_muenze_rs_mc_20c_2ser_lightend;
                coinResIds[1][1] = R.drawable.euro_muenze_rs_mc_2c_2ser_lightend;
                coinResIds[7][1] = R.drawable.euro_muenze_rs_mc_2e_2ser_lightend;
                coinResIds[5][1] = R.drawable.euro_muenze_rs_mc_50c_2ser_lightend;
                coinResIds[2][1] = R.drawable.euro_muenze_rs_mc_5c_2ser_lightend;
            } else {
                if (fillSeries) {
                    country.addSeries(country.getStartYear(), null);
                }
                coinResIds[3][0] = R.drawable.euro_muenze_rs_mc_10c;
                coinResIds[0][0] = R.drawable.euro_muenze_rs_mc_1c;
                coinResIds[6][0] = R.drawable.euro_muenze_rs_mc_1e;
                coinResIds[4][0] = R.drawable.euro_muenze_rs_mc_20c;
                coinResIds[1][0] = R.drawable.euro_muenze_rs_mc_2c;
                coinResIds[7][0] = R.drawable.euro_muenze_rs_mc_2e;
                coinResIds[5][0] = R.drawable.euro_muenze_rs_mc_50c;
                coinResIds[2][0] = R.drawable.euro_muenze_rs_mc_5c;

                coinResIds[3][1] = R.drawable.euro_muenze_rs_mc_10c_lightend;
                coinResIds[0][1] = R.drawable.euro_muenze_rs_mc_1c_lightend;
                coinResIds[6][1] = R.drawable.euro_muenze_rs_mc_1e_lightend;
                coinResIds[4][1] = R.drawable.euro_muenze_rs_mc_20c_lightend;
                coinResIds[1][1] = R.drawable.euro_muenze_rs_mc_2c_lightend;
                coinResIds[7][1] = R.drawable.euro_muenze_rs_mc_2e_lightend;
                coinResIds[5][1] = R.drawable.euro_muenze_rs_mc_50c_lightend;
                coinResIds[2][1] = R.drawable.euro_muenze_rs_mc_5c_lightend;
            }
        } else if (countrycode.equals(Countries.country_netherlands.getCountryCode())) {
            if (year >= 2014) {
                if (fillSeries) {
                    country.addSeries(2014, null);
                }
                coinResIds[3][0] = R.drawable.euro_muenze_rs_ne_10c_2;
                coinResIds[0][0] = R.drawable.euro_muenze_rs_ne_1c_2;
                coinResIds[6][0] = R.drawable.euro_muenze_rs_ne_1e_2;
                coinResIds[4][0] = R.drawable.euro_muenze_rs_ne_20c_2;
                coinResIds[1][0] = R.drawable.euro_muenze_rs_ne_2c_2;
                coinResIds[7][0] = R.drawable.euro_muenze_rs_ne_2e_2;
                coinResIds[5][0] = R.drawable.euro_muenze_rs_ne_50c_2;
                coinResIds[2][0] = R.drawable.euro_muenze_rs_ne_5c_2;

                coinResIds[3][1] = R.drawable.euro_muenze_rs_ne_10c_2_lightend;
                coinResIds[0][1] = R.drawable.euro_muenze_rs_ne_1c_2_lightend;
                coinResIds[6][1] = R.drawable.euro_muenze_rs_ne_1e_2_lightend;
                coinResIds[4][1] = R.drawable.euro_muenze_rs_ne_20c_2_lightend;
                coinResIds[1][1] = R.drawable.euro_muenze_rs_ne_2c_2_lightend;
                coinResIds[7][1] = R.drawable.euro_muenze_rs_ne_2e_2_lightend;
                coinResIds[5][1] = R.drawable.euro_muenze_rs_ne_50c_2_lightend;
                coinResIds[2][1] = R.drawable.euro_muenze_rs_ne_5c_2_lightend;
            } else {
                if (fillSeries) {
                    country.addSeries(country.getStartYear(), null);
                }
                coinResIds[3][0] = R.drawable.euro_muenze_rs_ne_10c;
                coinResIds[0][0] = R.drawable.euro_muenze_rs_ne_1c;
                coinResIds[6][0] = R.drawable.euro_muenze_rs_ne_1e;
                coinResIds[4][0] = R.drawable.euro_muenze_rs_ne_20c;
                coinResIds[1][0] = R.drawable.euro_muenze_rs_ne_2c;
                coinResIds[7][0] = R.drawable.euro_muenze_rs_ne_2e;
                coinResIds[5][0] = R.drawable.euro_muenze_rs_ne_50c;
                coinResIds[2][0] = R.drawable.euro_muenze_rs_ne_5c;

                coinResIds[3][1] = R.drawable.euro_muenze_rs_ne_10c_lightend;
                coinResIds[0][1] = R.drawable.euro_muenze_rs_ne_1c_lightend;
                coinResIds[6][1] = R.drawable.euro_muenze_rs_ne_1e_lightend;
                coinResIds[4][1] = R.drawable.euro_muenze_rs_ne_20c_lightend;
                coinResIds[1][1] = R.drawable.euro_muenze_rs_ne_2c_lightend;
                coinResIds[7][1] = R.drawable.euro_muenze_rs_ne_2e_lightend;
                coinResIds[5][1] = R.drawable.euro_muenze_rs_ne_50c_lightend;
                coinResIds[2][1] = R.drawable.euro_muenze_rs_ne_5c_lightend;
            }
        } else if (countrycode.equals(Countries.country_austria.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_at_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_at_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_at_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_at_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_at_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_at_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_at_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_at_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_at_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_at_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_at_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_at_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_at_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_at_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_at_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_at_5c_lightend;
        } else if (countrycode.equals(Countries.country_portugal.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_po_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_po_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_po_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_po_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_po_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_po_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_po_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_po_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_po_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_po_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_po_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_po_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_po_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_po_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_po_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_po_5c_lightend;
        } else if (countrycode.equals(Countries.country_sanmarino.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_sm_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_sm_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_sm_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_sm_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_sm_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_sm_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_sm_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_sm_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_sm_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_sm_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_sm_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_sm_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_sm_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_sm_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_sm_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_sm_5c_lightend;
        } else if (countrycode.equals(Countries.country_slovakia.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_sk_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_sk_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_sk_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_sk_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_sk_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_sk_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_sk_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_sk_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_sk_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_sk_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_sk_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_sk_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_sk_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_sk_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_sk_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_sk_5c_lightend;
        } else if (countrycode.equals(Countries.country_slovenia.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_si_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_si_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_si_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_si_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_si_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_si_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_si_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_si_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_si_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_si_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_si_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_si_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_si_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_si_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_si_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_si_5c_lightend;
        } else if (countrycode.equals(Countries.country_spain.getCountryCode())) {
            if (year >= 2015) {
                if (fillSeries) {
                    country.addSeries(2015, null, 6, 7);
                }
                coinResIds[3][0] = R.drawable.euro_muenze_rs_es_2010_10c;
                coinResIds[0][0] = R.drawable.euro_muenze_rs_es_2010_1c;
                coinResIds[6][0] = R.drawable.euro_muenze_rs_es_2010_1e_henri;
                coinResIds[4][0] = R.drawable.euro_muenze_rs_es_2010_20c;
                coinResIds[1][0] = R.drawable.euro_muenze_rs_es_2010_2c;
                coinResIds[7][0] = R.drawable.euro_muenze_rs_es_2010_2e_henri;
                coinResIds[5][0] = R.drawable.euro_muenze_rs_es_2010_50c;
                coinResIds[2][0] = R.drawable.euro_muenze_rs_es_2010_5c;

                coinResIds[3][1] = R.drawable.euro_muenze_rs_es_2010_10c_lightend;
                coinResIds[0][1] = R.drawable.euro_muenze_rs_es_2010_1c_lightend;
                coinResIds[6][1] = R.drawable.euro_muenze_rs_es_2010_1e_henri_lightend;
                coinResIds[4][1] = R.drawable.euro_muenze_rs_es_2010_20c_lightend;
                coinResIds[1][1] = R.drawable.euro_muenze_rs_es_2010_2c_lightend;
                coinResIds[7][1] = R.drawable.euro_muenze_rs_es_2010_2e_henri_lightend;
                coinResIds[5][1] = R.drawable.euro_muenze_rs_es_2010_50c_lightend;
                coinResIds[2][1] = R.drawable.euro_muenze_rs_es_2010_5c_lightend;
            } else if (year >= 2010) {
                if (fillSeries) {
                    country.addSeries(2010, null);
                }
                coinResIds[3][0] = R.drawable.euro_muenze_rs_es_2010_10c;
                coinResIds[0][0] = R.drawable.euro_muenze_rs_es_2010_1c;
                coinResIds[6][0] = R.drawable.euro_muenze_rs_es_2010_1e;
                coinResIds[4][0] = R.drawable.euro_muenze_rs_es_2010_20c;
                coinResIds[1][0] = R.drawable.euro_muenze_rs_es_2010_2c;
                coinResIds[7][0] = R.drawable.euro_muenze_rs_es_2010_2e;
                coinResIds[5][0] = R.drawable.euro_muenze_rs_es_2010_50c;
                coinResIds[2][0] = R.drawable.euro_muenze_rs_es_2010_5c;

                coinResIds[3][1] = R.drawable.euro_muenze_rs_es_2010_10c_lightend;
                coinResIds[0][1] = R.drawable.euro_muenze_rs_es_2010_1c_lightend;
                coinResIds[6][1] = R.drawable.euro_muenze_rs_es_2010_1e_lightend;
                coinResIds[4][1] = R.drawable.euro_muenze_rs_es_2010_20c_lightend;
                coinResIds[1][1] = R.drawable.euro_muenze_rs_es_2010_2c_lightend;
                coinResIds[7][1] = R.drawable.euro_muenze_rs_es_2010_2e_lightend;
                coinResIds[5][1] = R.drawable.euro_muenze_rs_es_2010_50c_lightend;
                coinResIds[2][1] = R.drawable.euro_muenze_rs_es_2010_5c_lightend;
            } else {
                if (fillSeries) {
                    country.addSeries(country.getStartYear(), null);
                }
                coinResIds[3][0] = R.drawable.euro_muenze_rs_es_10c;
                coinResIds[0][0] = R.drawable.euro_muenze_rs_es_1c;
                coinResIds[6][0] = R.drawable.euro_muenze_rs_es_1e;
                coinResIds[4][0] = R.drawable.euro_muenze_rs_es_20c;
                coinResIds[1][0] = R.drawable.euro_muenze_rs_es_2c;
                coinResIds[7][0] = R.drawable.euro_muenze_rs_es_2e;
                coinResIds[5][0] = R.drawable.euro_muenze_rs_es_50c;
                coinResIds[2][0] = R.drawable.euro_muenze_rs_es_5c;

                coinResIds[3][1] = R.drawable.euro_muenze_rs_es_10c_lightend;
                coinResIds[0][1] = R.drawable.euro_muenze_rs_es_1c_lightend;
                coinResIds[6][1] = R.drawable.euro_muenze_rs_es_1e_lightend;
                coinResIds[4][1] = R.drawable.euro_muenze_rs_es_20c_lightend;
                coinResIds[1][1] = R.drawable.euro_muenze_rs_es_2c_lightend;
                coinResIds[7][1] = R.drawable.euro_muenze_rs_es_2e_lightend;
                coinResIds[5][1] = R.drawable.euro_muenze_rs_es_50c_lightend;
                coinResIds[2][1] = R.drawable.euro_muenze_rs_es_5c_lightend;
            }
        } else if (countrycode.equals(Countries.country_vatican.getCountryCode())) {
            if (year >= 2014) {
                if (fillSeries) {
                    country.addSeries(2014, null);
                }
                coinResIds[3][0] = R.drawable.euro_muenze_rs_va_10c_francis;
                coinResIds[0][0] = R.drawable.euro_muenze_rs_va_1c_francis;
                coinResIds[6][0] = R.drawable.euro_muenze_rs_va_1e_francis;
                coinResIds[4][0] = R.drawable.euro_muenze_rs_va_20c_francis;
                coinResIds[1][0] = R.drawable.euro_muenze_rs_va_2c_francis;
                coinResIds[7][0] = R.drawable.euro_muenze_rs_va_2e_francis;
                coinResIds[5][0] = R.drawable.euro_muenze_rs_va_50c_francis;
                coinResIds[2][0] = R.drawable.euro_muenze_rs_va_5c_francis;

                coinResIds[3][1] = R.drawable.euro_muenze_rs_va_10c_francis_lightend;
                coinResIds[0][1] = R.drawable.euro_muenze_rs_va_1c_francis_lightend;
                coinResIds[6][1] = R.drawable.euro_muenze_rs_va_1e_francis_lightend;
                coinResIds[4][1] = R.drawable.euro_muenze_rs_va_20c_francis_lightend;
                coinResIds[1][1] = R.drawable.euro_muenze_rs_va_2c_francis_lightend;
                coinResIds[7][1] = R.drawable.euro_muenze_rs_va_2e_francis_lightend;
                coinResIds[5][1] = R.drawable.euro_muenze_rs_va_50c_francis_lightend;
                coinResIds[2][1] = R.drawable.euro_muenze_rs_va_5c_francis_lightend;
            } else if (year >= 2006) {
                if (fillSeries) {
                    country.addSeries(2006, null);
                }
                coinResIds[3][0] = R.drawable.euro_muenze_rs_va_10c;
                coinResIds[0][0] = R.drawable.euro_muenze_rs_va_1c;
                coinResIds[6][0] = R.drawable.euro_muenze_rs_va_1e;
                coinResIds[4][0] = R.drawable.euro_muenze_rs_va_20c;
                coinResIds[1][0] = R.drawable.euro_muenze_rs_va_2c;
                coinResIds[7][0] = R.drawable.euro_muenze_rs_va_2e;
                coinResIds[5][0] = R.drawable.euro_muenze_rs_va_50c;
                coinResIds[2][0] = R.drawable.euro_muenze_rs_va_5c;

                coinResIds[3][1] = R.drawable.euro_muenze_rs_va_10c_lightend;
                coinResIds[0][1] = R.drawable.euro_muenze_rs_va_1c_lightend;
                coinResIds[6][1] = R.drawable.euro_muenze_rs_va_1e_lightend;
                coinResIds[4][1] = R.drawable.euro_muenze_rs_va_20c_lightend;
                coinResIds[1][1] = R.drawable.euro_muenze_rs_va_2c_lightend;
                coinResIds[7][1] = R.drawable.euro_muenze_rs_va_2e_lightend;
                coinResIds[5][1] = R.drawable.euro_muenze_rs_va_50c_lightend;
                coinResIds[2][1] = R.drawable.euro_muenze_rs_va_5c_lightend;
            } else {
                if (fillSeries) {
                    country.addSeries(country.getStartYear(), null);
                }
                coinResIds[3][0] = R.drawable.euro_muenze_rs_va_10c_paul;
                coinResIds[0][0] = R.drawable.euro_muenze_rs_va_1c_paul;
                coinResIds[6][0] = R.drawable.euro_muenze_rs_va_1e_paul;
                coinResIds[4][0] = R.drawable.euro_muenze_rs_va_20c_paul;
                coinResIds[1][0] = R.drawable.euro_muenze_rs_va_2c_paul;
                coinResIds[7][0] = R.drawable.euro_muenze_rs_va_2e_paul;
                coinResIds[5][0] = R.drawable.euro_muenze_rs_va_50c_paul;
                coinResIds[2][0] = R.drawable.euro_muenze_rs_va_5c_paul;

                coinResIds[3][1] = R.drawable.euro_muenze_rs_va_10c_paul_lightend;
                coinResIds[0][1] = R.drawable.euro_muenze_rs_va_1c_paul_lightend;
                coinResIds[6][1] = R.drawable.euro_muenze_rs_va_1e_paul_lightend;
                coinResIds[4][1] = R.drawable.euro_muenze_rs_va_20c_paul_lightend;
                coinResIds[1][1] = R.drawable.euro_muenze_rs_va_2c_paul_lightend;
                coinResIds[7][1] = R.drawable.euro_muenze_rs_va_2e_paul_lightend;
                coinResIds[5][1] = R.drawable.euro_muenze_rs_va_50c_paul_lightend;
                coinResIds[2][1] = R.drawable.euro_muenze_rs_va_5c_paul_lightend;
            }
        } else if (countrycode.equals(Countries.country_cyprus.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_cy_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_cy_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_cy_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_cy_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_cy_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_cy_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_cy_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_cy_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_cy_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_cy_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_cy_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_cy_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_cy_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_cy_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_cy_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_cy_5c_lightend;
        } else if (countrycode.equals(Countries.country_andorra.getCountryCode())) {
            if (fillSeries) {
                country.addSeries(country.getStartYear(), null);
            }
            coinResIds[3][0] = R.drawable.euro_muenze_rs_ad_10c;
            coinResIds[0][0] = R.drawable.euro_muenze_rs_ad_1c;
            coinResIds[6][0] = R.drawable.euro_muenze_rs_ad_1e;
            coinResIds[4][0] = R.drawable.euro_muenze_rs_ad_20c;
            coinResIds[1][0] = R.drawable.euro_muenze_rs_ad_2c;
            coinResIds[7][0] = R.drawable.euro_muenze_rs_ad_2e;
            coinResIds[5][0] = R.drawable.euro_muenze_rs_ad_50c;
            coinResIds[2][0] = R.drawable.euro_muenze_rs_ad_5c;

            coinResIds[3][1] = R.drawable.euro_muenze_rs_ad_10c_lightend;
            coinResIds[0][1] = R.drawable.euro_muenze_rs_ad_1c_lightend;
            coinResIds[6][1] = R.drawable.euro_muenze_rs_ad_1e_lightend;
            coinResIds[4][1] = R.drawable.euro_muenze_rs_ad_20c_lightend;
            coinResIds[1][1] = R.drawable.euro_muenze_rs_ad_2c_lightend;
            coinResIds[7][1] = R.drawable.euro_muenze_rs_ad_2e_lightend;
            coinResIds[5][1] = R.drawable.euro_muenze_rs_ad_50c_lightend;
            coinResIds[2][1] = R.drawable.euro_muenze_rs_ad_5c_lightend;
        }
        coinSetResId.add(coinResIds);
        return coinSetResId;
    }

    public static int[][] getGreece2002XCoinImages() {
        // this is for the greece coins which have been minted outside greece and have special mint marks
        Countries.country_greece.addSeries(2002, GREECE_2002_SPECIAL_TITLE);
        int[][] coinResIds = new int[][] {
                {R.drawable.euro_muenze_rs_gr_1c_x,R.drawable.euro_muenze_rs_gr_1c_x_lightend},
                {R.drawable.euro_muenze_rs_gr_2c_x,R.drawable.euro_muenze_rs_gr_2c_x_lightend},
                {R.drawable.euro_muenze_rs_gr_5c_x,R.drawable.euro_muenze_rs_gr_5c_x_lightend},
                {R.drawable.euro_muenze_rs_gr_10c_x,R.drawable.euro_muenze_rs_gr_10c_x_lightend},
                {R.drawable.euro_muenze_rs_gr_20c_x,R.drawable.euro_muenze_rs_gr_20c_x_lightend},
                {R.drawable.euro_muenze_rs_gr_50c_x,R.drawable.euro_muenze_rs_gr_50c_x_lightend},
                {R.drawable.euro_muenze_rs_gr_1e_x,R.drawable.euro_muenze_rs_gr_1e_x_lightend},
                {R.drawable.euro_muenze_rs_gr_2e_x,R.drawable.euro_muenze_rs_gr_2e_x_lightend}
        };
        return coinResIds;
    }

    public static int[][] getVatican2005XCoinImages() {
        // this is for the greece coins which have been minted outside greece and have special mint marks
        Countries.country_vatican.addSeries(2005, VATICAN_2005_SPECIAL_TITLE);
        int[][] coinResIds = new int[CoinSet.COINS_PER_SET_STD][2];
        coinResIds[3][0] = R.drawable.euro_muenze_rs_va_10c_sede;
        coinResIds[0][0] = R.drawable.euro_muenze_rs_va_1c_sede;
        coinResIds[6][0] = R.drawable.euro_muenze_rs_va_1e_sede;
        coinResIds[4][0] = R.drawable.euro_muenze_rs_va_20c_sede;
        coinResIds[1][0] = R.drawable.euro_muenze_rs_va_2c_sede;
        coinResIds[7][0] = R.drawable.euro_muenze_rs_va_2e_sede;
        coinResIds[5][0] = R.drawable.euro_muenze_rs_va_50c_sede;
        coinResIds[2][0] = R.drawable.euro_muenze_rs_va_5c_sede;

        coinResIds[3][1] = R.drawable.euro_muenze_rs_va_10c_sede_lightend;
        coinResIds[0][1] = R.drawable.euro_muenze_rs_va_1c_sede_lightend;
        coinResIds[6][1] = R.drawable.euro_muenze_rs_va_1e_sede_lightend;
        coinResIds[4][1] = R.drawable.euro_muenze_rs_va_20c_sede_lightend;
        coinResIds[1][1] = R.drawable.euro_muenze_rs_va_2c_sede_lightend;
        coinResIds[7][1] = R.drawable.euro_muenze_rs_va_2e_sede_lightend;
        coinResIds[5][1] = R.drawable.euro_muenze_rs_va_50c_sede_lightend;
        coinResIds[2][1] = R.drawable.euro_muenze_rs_va_5c_sede_lightend;
        return coinResIds;
    }

    public static int[] getCommonCoinImageResIds(Database database) {
        int[] imgResIds = new int[CoinSet.COINS_PER_SET];
        imgResIds[0] = R.drawable.euro_muenze_rs_common_1cent;
        imgResIds[1] = R.drawable.euro_muenze_rs_common_2cent;
        imgResIds[2] = R.drawable.euro_muenze_rs_common_5cent;
        imgResIds[3] = R.drawable.euro_muenze_rs_common_10cent;
        imgResIds[4] = R.drawable.euro_muenze_rs_common_20cent;
        imgResIds[5] = R.drawable.euro_muenze_rs_common_50cent;
        imgResIds[6] = R.drawable.euro_muenze_rs_common_1euro;
        imgResIds[7] = R.drawable.euro_muenze_rs_common_2euro;
        imgResIds[8] = R.drawable.euro_muenze_rs_common_2euro;
        imgResIds[9] = R.drawable.euro_muenze_rs_common_2euro;
        imgResIds[10] = R.drawable.add_custom_2_euro_coin;
        return imgResIds;
    }

    public static ArrayList<String> getCommonCoinSetTitles(String countryCode) {
        ArrayList<String> commonCoinSetTitles = new ArrayList<String>();
        switch (countryCode) {
            case Countries.COUNTRY_CODE_DE:
                commonCoinSetTitles.add("A");
                commonCoinSetTitles.add("D");
                commonCoinSetTitles.add("F");
                commonCoinSetTitles.add("G");
                commonCoinSetTitles.add("J");
        }
        return commonCoinSetTitles;
    }
}