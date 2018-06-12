package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.mm.a.o;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.protocal.c.akz;
import com.tencent.mm.protocal.c.ax;
import com.tencent.mm.protocal.c.bng;
import com.tencent.mm.protocal.c.bsf;
import com.tencent.mm.protocal.c.bwx;
import com.tencent.mm.protocal.c.iu;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.kz;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.lk;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.protocal.c.sd;
import com.tencent.mm.protocal.c.se;
import com.tencent.mm.protocal.c.sw;
import com.tencent.mm.protocal.c.xk;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  private static kx A(JSONObject paramJSONObject)
  {
    Object localObject2 = null;
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.CardInfoParser", "parserCardDataInfo json is null");
      return null;
    }
    localkx = new kx();
    try
    {
      localkx.status = paramJSONObject.optInt("status");
      localkx.rmV = paramJSONObject.optInt("init_balance");
      localkx.rmW = paramJSONObject.optInt("init_bonus");
      Object localObject1 = paramJSONObject.optJSONArray("cell_list0");
      if (localObject1 != null) {
        localkx.rmX = j((JSONArray)localObject1);
      }
      localObject1 = paramJSONObject.optJSONArray("cell_list1");
      if (localObject1 != null) {
        localkx.rmY = j((JSONArray)localObject1);
      }
      localObject1 = paramJSONObject.optJSONArray("cell_list2");
      if (localObject1 != null) {
        localkx.rmZ = j((JSONArray)localObject1);
      }
      JSONArray localJSONArray = paramJSONObject.optJSONArray("acceptors");
      if (localJSONArray != null)
      {
        localObject1 = localObject2;
        if (localJSONArray != null)
        {
          if (localJSONArray.length() != 0) {
            break label440;
          }
          localObject1 = localObject2;
        }
      }
      for (;;)
      {
        localkx.rna = ((LinkedList)localObject1);
        localkx.rnb = paramJSONObject.optInt("avail_num");
        localkx.rnc = paramJSONObject.optInt("code_type");
        localkx.code = paramJSONObject.optString("code");
        localObject1 = paramJSONObject.optJSONArray("secondary_fields");
        if (localObject1 != null) {
          localkx.rnd = k((JSONArray)localObject1);
        }
        localkx.rne = paramJSONObject.optLong("stock_num");
        localkx.rnf = paramJSONObject.optInt("limit_num");
        localkx.rng = paramJSONObject.optString("user_report_url");
        localObject1 = paramJSONObject.optJSONObject("third_field");
        if (localObject1 != null) {
          localkx.rnh = D((JSONObject)localObject1);
        }
        localkx.rni = l(paramJSONObject.optJSONArray("action_sheets"));
        localObject1 = paramJSONObject.optJSONObject("card_list_field");
        if (localObject1 != null) {
          localkx.rnj = D((JSONObject)localObject1);
        }
        localObject1 = paramJSONObject.optJSONObject("operate_field");
        if (localObject1 != null) {
          localkx.rnk = D((JSONObject)localObject1);
        }
        localObject1 = paramJSONObject.optJSONObject("limit_field");
        if (localObject1 != null) {
          localkx.rnl = D((JSONObject)localObject1);
        }
        localObject1 = paramJSONObject.optJSONObject("detail_table");
        if (localObject1 != null) {
          localkx.rnm = G((JSONObject)localObject1);
        }
        localkx.rnn = paramJSONObject.optString("background_pic_url");
        localObject1 = paramJSONObject.optJSONObject("gifting_info_cell");
        if (localObject1 != null) {
          localkx.rno = D((JSONObject)localObject1);
        }
        localkx.rnp = paramJSONObject.optString("sign_number");
        localObject1 = paramJSONObject.optJSONObject("unavailable_qrcode_field");
        if (localObject1 != null) {
          localkx.rnq = D((JSONObject)localObject1);
        }
        localkx.rnr = paramJSONObject.optBoolean("is_commom_card");
        localkx.rns = paramJSONObject.optBoolean("is_location_authorized");
        break;
        label440:
        localObject1 = new LinkedList();
        int i = 0;
        while (i < localJSONArray.length())
        {
          ((LinkedList)localObject1).add((String)localJSONArray.get(i));
          i += 1;
        }
      }
      return localkx;
    }
    catch (JSONException paramJSONObject)
    {
      x.printErrStackTrace("MicroMsg.CardInfoParser", paramJSONObject, "", new Object[0]);
    }
  }
  
  public static lf B(JSONObject paramJSONObject)
  {
    Object localObject2 = null;
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.CardInfoParser", "parserCardTpInfo json is null");
      return null;
    }
    lf locallf = new lf();
    Object localObject1;
    Object localObject3;
    try
    {
      locallf.huU = paramJSONObject.optString("card_tp_id");
      locallf.huW = paramJSONObject.optString("logo_url");
      locallf.bPS = paramJSONObject.optString("appid");
      locallf.rnD = paramJSONObject.optString("app_username");
      locallf.rnE = paramJSONObject.optInt("card_category");
      locallf.huV = paramJSONObject.optInt("card_type");
      locallf.hwh = paramJSONObject.optString("brand_name");
      locallf.title = paramJSONObject.optString("title");
      locallf.huX = paramJSONObject.optString("sub_title");
      locallf.dxh = paramJSONObject.optString("color");
      locallf.hUy = paramJSONObject.optString("notice");
      locallf.rnF = paramJSONObject.optString("service_phone");
      locallf.rnI = paramJSONObject.optString("image_text_url");
      locallf.rnJ = paramJSONObject.optString("source_icon");
      locallf.bhd = paramJSONObject.optString("source");
      localObject1 = paramJSONObject.optJSONArray("primary_fields");
      if (localObject1 != null) {
        locallf.rnG = k((JSONArray)localObject1);
      }
      localObject1 = paramJSONObject.optJSONArray("introduce_fields");
      if (localObject1 != null) {
        locallf.rnH = k((JSONArray)localObject1);
      }
      locallf.rnK = paramJSONObject.optInt("shop_count");
      locallf.rnL = paramJSONObject.optString("limit_wording");
      locallf.hwg = paramJSONObject.optString("card_type_name");
      locallf.rnM = paramJSONObject.optString("h5_show_url");
      locallf.rnN = paramJSONObject.optInt("block_mask");
      locallf.rnO = paramJSONObject.optString("middle_icon");
      locallf.rnP = paramJSONObject.optString("accept_wording");
      locallf.rnQ = paramJSONObject.optLong("control_flag");
      locallf.rnR = paramJSONObject.optString("advertise_wording");
      locallf.rnS = paramJSONObject.optString("advertise_url");
      locallf.rnT = paramJSONObject.optString("public_service_name");
      localObject3 = paramJSONObject.optJSONObject("announcement");
      if (localObject3 == null)
      {
        x.e("MicroMsg.CardInfoParser", "parserannoucement json is null");
        localObject1 = null;
      }
      for (;;)
      {
        locallf.rnU = ((kz)localObject1);
        locallf.rnV = paramJSONObject.optString("public_service_tip");
        locallf.rnW = paramJSONObject.optString("primary_sub_title");
        locallf.rnX = paramJSONObject.optInt("gen_type");
        locallf.rnY = E(paramJSONObject.optJSONObject("detail_struct"));
        localObject3 = paramJSONObject.optJSONObject("use_condition");
        if (localObject3 != null) {
          break;
        }
        x.e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
        localObject1 = null;
        locallf.rnZ = ((bwx)localObject1);
        localObject3 = paramJSONObject.optJSONObject("follow_box");
        if (localObject3 != null) {
          break label1137;
        }
        x.e("MicroMsg.CardInfoParser", "parserFollowBox json is null");
        localObject1 = null;
        label509:
        locallf.roa = ((xk)localObject1);
        localObject3 = paramJSONObject.optJSONObject("guidance");
        if (localObject3 != null) {
          break label1210;
        }
        x.e("MicroMsg.CardInfoParser", "parserActionSheet json is null");
        localObject1 = null;
        label539:
        locallf.rob = ((ax)localObject1);
        locallf.roc = paramJSONObject.optInt("need_direct_jump", 0);
        locallf.rod = paramJSONObject.optInt("is_acceptable", 0);
        locallf.roe = paramJSONObject.optString("unacceptable_wording");
        locallf.rof = paramJSONObject.optInt("has_hongbao", 0);
        locallf.rog = paramJSONObject.optString("accept_ui_title");
        locallf.roh = paramJSONObject.optInt("show_accept_view", 0);
        localObject1 = paramJSONObject.optJSONObject("brand_field");
        if (localObject1 != null) {
          locallf.roi = D((JSONObject)localObject1);
        }
        locallf.roj = paramJSONObject.optString("shop_name");
        localObject1 = paramJSONObject.optJSONObject("pay_and_qrcode_field");
        if (localObject1 != null) {
          locallf.rok = D((JSONObject)localObject1);
        }
        localObject3 = paramJSONObject.optJSONObject("dynamic_qr_code_info");
        if (localObject3 != null)
        {
          if (localObject3 != null) {
            break label1245;
          }
          x.e("MicroMsg.CardInfoParser", "parserDynamicQrCodeInfo json is null");
          localObject1 = null;
          label704:
          locallf.rol = ((sw)localObject1);
        }
        locallf.rom = paramJSONObject.optBoolean("is_card_code_exposed");
        locallf.ron = paramJSONObject.optInt("qrcode_correct_level");
        locallf.roo = paramJSONObject.optBoolean("dismiss_qrcode_icon_on_card");
        locallf.rop = paramJSONObject.optBoolean("need_location");
        localObject3 = paramJSONObject.optJSONObject("bluetooth_info");
        if (localObject3 != null)
        {
          if (localObject3 != null) {
            break label1343;
          }
          x.e("MicroMsg.CardInfoParser", "parseBluetoothInfo json is null");
          localObject1 = localObject2;
          label787:
          locallf.roq = ((iu)localObject1);
        }
        locallf.ror = paramJSONObject.optString("biz_nickname");
        break label1398;
        localObject1 = new kz();
        ((kz)localObject1).type = ((JSONObject)localObject3).optInt("type");
        ((kz)localObject1).text = ((JSONObject)localObject3).optString("text");
        ((kz)localObject1).url = ((JSONObject)localObject3).optString("url");
        ((kz)localObject1).mXw = ((JSONObject)localObject3).optInt("endtime");
        ((kz)localObject1).create_time = ((JSONObject)localObject3).optInt("create_time");
        ((kz)localObject1).rnt = ((JSONObject)localObject3).optString("thumb_url");
      }
      localObject1 = new bwx();
    }
    catch (JSONException paramJSONObject)
    {
      x.printErrStackTrace("MicroMsg.CardInfoParser", paramJSONObject, "", new Object[0]);
    }
    ((bwx)localObject1).title = ((JSONObject)localObject3).optString("title");
    JSONArray localJSONArray = ((JSONObject)localObject3).optJSONArray("outer_tag_list");
    int i;
    label963:
    bsf localbsf;
    if ((localJSONArray != null) && (localJSONArray.length() > 0))
    {
      ((bwx)localObject1).stj = new LinkedList();
      i = 0;
      if (i < localJSONArray.length())
      {
        localbsf = F(localJSONArray.optJSONObject(i));
        if (localbsf == null) {
          break label1401;
        }
        ((bwx)localObject1).stj.add(localbsf);
        break label1401;
      }
    }
    else
    {
      x.e("MicroMsg.CardInfoParser", "parserUseCondition outer_tag_list is null");
    }
    localJSONArray = ((JSONObject)localObject3).optJSONArray("inner_tag_list");
    if ((localJSONArray != null) && (localJSONArray.length() > 0))
    {
      ((bwx)localObject1).stk = new LinkedList();
      i = 0;
    }
    for (;;)
    {
      if (i < localJSONArray.length())
      {
        localbsf = F(localJSONArray.optJSONObject(i));
        if (localbsf != null)
        {
          ((bwx)localObject1).stk.add(localbsf);
          break label1408;
          x.e("MicroMsg.CardInfoParser", "parserUseCondition inner_tag_list is null");
        }
      }
      else
      {
        localObject3 = ((JSONObject)localObject3).optJSONArray("detail_field");
        if ((localObject3 != null) && (((JSONArray)localObject3).length() > 0))
        {
          ((bwx)localObject1).stl = k((JSONArray)localObject3);
          break;
        }
        x.e("MicroMsg.CardInfoParser", "parserUseCondition detail_field is null");
        break;
        label1137:
        localObject1 = new xk();
        ((xk)localObject1).text = ((JSONObject)localObject3).optString("text");
        ((xk)localObject1).rDo = ((JSONObject)localObject3).optInt("follow");
        x.i("MicroMsg.CardInfoParser", "follow:" + ((xk)localObject1).rDo + "　text:" + ((xk)localObject1).text);
        break label509;
        label1210:
        localObject1 = new ax();
        ((ax)localObject1).text = ((JSONObject)localObject3).optString("text");
        ((ax)localObject1).url = ((JSONObject)localObject3).optString("url");
        break label539;
        label1245:
        localObject1 = new sw();
        ((sw)localObject1).rwc = ((JSONObject)localObject3).optBoolean("is_dynamic");
        ((sw)localObject1).rwd = ((JSONObject)localObject3).optBoolean("can_refresh");
        ((sw)localObject1).rwe = ((JSONObject)localObject3).optString("refresh_wording");
        x.i("MicroMsg.CardInfoParser", "is_dynamic:" + ((sw)localObject1).rwc + "　can_refresh:" + ((sw)localObject1).rwd + "　refresh_wording:" + ((sw)localObject1).rwe);
        break label704;
        label1343:
        localObject1 = new iu();
        ((iu)localObject1).name = ((JSONObject)localObject3).optString("name");
        ((iu)localObject1).rjZ = ((JSONObject)localObject3).optInt("report_time_interval", 0);
        x.i("MicroMsg.CardInfoParser", "blueToothInfo.name:%s", new Object[] { ((iu)localObject1).name });
        break label787;
        label1398:
        return locallf;
        label1401:
        i += 1;
        break label963;
      }
      label1408:
      i += 1;
    }
  }
  
  private static bng C(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.CardInfoParser", "parserShareInfo json is null");
      return null;
    }
    bng localbng = new bng();
    localbng.sli = paramJSONObject.optString("gift_msg_title");
    return localbng;
  }
  
  private static pr D(JSONObject paramJSONObject)
  {
    akz localakz = null;
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.CardInfoParser", "parserThirdFiled json is null");
      return null;
    }
    pr localpr = new pr();
    localpr.title = paramJSONObject.optString("title");
    localpr.huY = paramJSONObject.optString("aux_title");
    localpr.huX = paramJSONObject.optString("sub_title");
    localpr.url = paramJSONObject.optString("url");
    localpr.roL = paramJSONObject.optLong("show_flag");
    localpr.roM = paramJSONObject.optString("primary_color");
    localpr.roN = paramJSONObject.optString("secondary_color");
    localpr.lMY = paramJSONObject.optString("icon_url");
    JSONObject localJSONObject = paramJSONObject.optJSONObject("gifting_info");
    if (localJSONObject != null)
    {
      if (localJSONObject != null) {
        break label165;
      }
      x.e("MicroMsg.CardInfoParser", "parserGiftInfo json is null");
    }
    for (;;)
    {
      localpr.rtT = localakz;
      localpr.rnv = paramJSONObject.optString("app_brand_user_name");
      localpr.rnw = paramJSONObject.optString("app_brand_pass");
      return localpr;
      label165:
      x.d("MicroMsg.CardInfoParser", "parserGitfInfo:%s", new Object[] { localJSONObject });
      localakz = new akz();
      localakz.qZT = o.cx(localJSONObject.optString("biz_uin"));
      localakz.qZU = localJSONObject.optString("order_id");
    }
  }
  
  private static sd E(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.CardInfoParser", "parserDetailStruct json is null");
      return null;
    }
    sd localsd = new sd();
    localsd.title = paramJSONObject.optString("title");
    localsd.url = paramJSONObject.optString("url");
    localsd.desc = paramJSONObject.optString("abstract");
    localsd.detail = paramJSONObject.optString("detail");
    localsd.rvA = paramJSONObject.optString("ad_title");
    JSONArray localJSONArray = paramJSONObject.optJSONArray("icon_url_list");
    if ((localJSONArray != null) && (localJSONArray.length() > 0))
    {
      LinkedList localLinkedList = new LinkedList();
      int i = 0;
      for (;;)
      {
        if (i >= localJSONArray.length()) {
          break label186;
        }
        paramJSONObject = "";
        try
        {
          String str = localJSONArray.getString(i);
          paramJSONObject = str;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.CardInfoParser", localJSONException, "", new Object[0]);
            x.e("MicroMsg.CardInfoParser", "getMessage:" + localJSONException.getMessage());
          }
        }
        localLinkedList.add(paramJSONObject);
        i += 1;
      }
      label186:
      localsd.rvz = localLinkedList;
    }
    for (;;)
    {
      return localsd;
      x.e("MicroMsg.CardInfoParser", "parserDetailStruct icon_url_list is null");
    }
  }
  
  private static bsf F(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
      return null;
    }
    bsf localbsf = new bsf();
    localbsf.tag = paramJSONObject.optString("tag");
    localbsf.dxh = paramJSONObject.optString("color");
    return localbsf;
  }
  
  private static se G(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.CardInfoParser", "parserDetailTable json is null");
      return null;
    }
    se localse = new se();
    localse.title = paramJSONObject.optString("title");
    localse.huX = paramJSONObject.optString("sub_title");
    localse.rvB = paramJSONObject.optInt("show_num", 0);
    paramJSONObject = paramJSONObject.optJSONArray("rows");
    if ((paramJSONObject != null) && (paramJSONObject.length() > 0)) {
      try
      {
        localse.rvC = k(paramJSONObject);
        return localse;
      }
      catch (JSONException paramJSONObject)
      {
        x.printErrStackTrace("MicroMsg.CardInfoParser", paramJSONObject, "", new Object[0]);
        x.e("MicroMsg.CardInfoParser", paramJSONObject.getMessage());
        return localse;
      }
    }
    x.e("MicroMsg.CardInfoParser", "parserDetailTable jsonArray is  null");
    return localse;
  }
  
  public static void a(CardInfo paramCardInfo, String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.CardInfoParser", "parserCardItemJson jsonContent is null");
      return;
    }
    try
    {
      a(paramCardInfo, new JSONObject(paramString));
      return;
    }
    catch (JSONException paramCardInfo)
    {
      x.printErrStackTrace("MicroMsg.CardInfoParser", paramCardInfo, "", new Object[0]);
    }
  }
  
  private static void a(CardInfo paramCardInfo, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.CardInfoParser", "parserCardItemJson json is null");
      return;
    }
    paramCardInfo.field_card_id = xP(paramJSONObject.optString("card_id"));
    paramCardInfo.field_card_tp_id = xP(paramJSONObject.optString("card_tp_id"));
    paramCardInfo.field_delete_state_flag = paramJSONObject.optInt("state_flag");
    paramCardInfo.field_updateTime = paramJSONObject.optInt("update_time");
    paramCardInfo.field_updateSeq = paramJSONObject.optLong("sequence");
    paramCardInfo.field_from_username = paramJSONObject.optString("from_username");
    paramCardInfo.field_begin_time = paramJSONObject.optLong("begin_time", 0L);
    paramCardInfo.field_end_time = paramJSONObject.optLong("end_time", 0L);
    paramCardInfo.huZ = paramJSONObject.optString("encrypt_code");
    JSONObject localJSONObject2 = paramJSONObject.optJSONObject("card_data_info");
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("card_tp_info");
    paramJSONObject = paramJSONObject.optJSONObject("share_info");
    paramCardInfo.hwa = A(localJSONObject2);
    paramCardInfo.hvZ = B(localJSONObject1);
    paramCardInfo.hwb = C(paramJSONObject);
    if (paramCardInfo.hvZ != null)
    {
      paramJSONObject = paramCardInfo.hvZ;
      paramCardInfo.hvZ = paramJSONObject;
    }
    try
    {
      paramCardInfo.field_cardTpInfoData = paramJSONObject.toByteArray();
      paramCardInfo.field_block_mask = Integer.toString(paramCardInfo.hvZ.rnN);
      paramCardInfo.field_card_type = paramCardInfo.hvZ.huV;
      if (TextUtils.isEmpty(paramCardInfo.field_card_tp_id)) {
        paramCardInfo.field_card_tp_id = paramCardInfo.hvZ.huU;
      }
      if ((paramCardInfo.field_begin_time == 0L) && (localJSONObject1 != null)) {
        paramCardInfo.field_begin_time = localJSONObject1.optLong("begin_time");
      }
      if ((paramCardInfo.field_end_time == 0L) && (localJSONObject1 != null)) {
        paramCardInfo.field_end_time = localJSONObject1.optLong("end_time");
      }
      if (paramCardInfo.hvZ.rol != null) {
        paramCardInfo.field_is_dynamic = paramCardInfo.hvZ.rol.rwc;
      }
      if (paramCardInfo.hwa != null)
      {
        paramCardInfo.a(paramCardInfo.hwa);
        paramCardInfo.field_status = paramCardInfo.hwa.status;
      }
      if (paramCardInfo.hwb != null)
      {
        paramJSONObject = paramCardInfo.hwb;
        paramCardInfo.hwb = paramJSONObject;
      }
    }
    catch (Exception paramJSONObject)
    {
      try
      {
        paramCardInfo.field_shareInfoData = paramJSONObject.toByteArray();
        paramCardInfo.field_local_updateTime = ((int)(System.currentTimeMillis() / 1000L));
        return;
        paramJSONObject = paramJSONObject;
        x.e("MicroMsg.CardInfo", "setCardTpInfo fail, ex = %s", new Object[] { paramJSONObject.getMessage() });
      }
      catch (Exception paramJSONObject)
      {
        for (;;)
        {
          x.e("MicroMsg.CardInfo", "setShareInfo fail, ex = %s", new Object[] { paramJSONObject.getMessage() });
          x.printErrStackTrace("MicroMsg.CardInfo", paramJSONObject, "", new Object[0]);
        }
      }
    }
  }
  
  public static void a(ShareCardInfo paramShareCardInfo, String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.CardInfoParser", "parserShareCardItemJson jsonContent is null");
      return;
    }
    try
    {
      a(paramShareCardInfo, new JSONObject(paramString).optJSONObject("share_card"));
      return;
    }
    catch (JSONException paramShareCardInfo)
    {
      x.printErrStackTrace("MicroMsg.CardInfoParser", paramShareCardInfo, "", new Object[0]);
      x.e("MicroMsg.CardInfoParser", paramShareCardInfo.getMessage());
    }
  }
  
  public static void a(ShareCardInfo paramShareCardInfo, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.CardInfoParser", "parserShareCardItemJson json is null");
      return;
    }
    paramShareCardInfo.field_card_id = xP(paramJSONObject.optString("card_id"));
    paramShareCardInfo.field_card_tp_id = xP(paramJSONObject.optString("card_tp_id"));
    paramShareCardInfo.field_app_id = paramJSONObject.optString("app_id");
    paramShareCardInfo.field_consumer = paramJSONObject.optString("consumer");
    paramShareCardInfo.field_share_time = paramJSONObject.optInt("share_time");
    paramShareCardInfo.field_updateTime = paramJSONObject.optInt("update_time");
    paramShareCardInfo.field_status = paramJSONObject.optInt("state_flag");
    paramShareCardInfo.field_updateSeq = paramJSONObject.optLong("sequence");
    paramShareCardInfo.field_from_username = paramJSONObject.optString("from_user_name");
    paramShareCardInfo.field_begin_time = paramJSONObject.optLong("begin_time");
    paramShareCardInfo.field_end_time = paramJSONObject.optInt("end_time");
    JSONObject localJSONObject2 = paramJSONObject.optJSONObject("card_data_info");
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("card_tp_info");
    paramJSONObject = paramJSONObject.optJSONObject("share_info");
    paramShareCardInfo.hwa = A(localJSONObject2);
    paramShareCardInfo.hvZ = B(localJSONObject1);
    paramShareCardInfo.hwb = C(paramJSONObject);
    if (paramShareCardInfo.hwa != null) {
      paramShareCardInfo.a(paramShareCardInfo.hwa);
    }
    if (paramShareCardInfo.hvZ != null)
    {
      paramJSONObject = paramShareCardInfo.hvZ;
      paramShareCardInfo.hvZ = paramJSONObject;
    }
    try
    {
      paramShareCardInfo.field_cardTpInfoData = paramJSONObject.toByteArray();
      paramShareCardInfo.field_end_time = localJSONObject1.optInt("end_time");
      paramShareCardInfo.field_begin_time = localJSONObject1.optInt("begin_time");
      if (paramShareCardInfo.hwb != null)
      {
        paramJSONObject = paramShareCardInfo.hwb;
        paramShareCardInfo.hwb = paramJSONObject;
      }
    }
    catch (Exception paramJSONObject)
    {
      try
      {
        paramShareCardInfo.field_shareInfoData = paramJSONObject.toByteArray();
        paramShareCardInfo.field_local_updateTime = ((int)(System.currentTimeMillis() / 1000L));
        return;
        paramJSONObject = paramJSONObject;
        x.e("MicroMsg.ShareCardInfo", "setCardTpInfo fail, ex = %s", new Object[] { paramJSONObject.getMessage() });
      }
      catch (Exception paramJSONObject)
      {
        for (;;)
        {
          x.e("MicroMsg.ShareCardInfo", "setShareInfo fail, ex = %s", new Object[] { paramJSONObject.getMessage() });
          x.printErrStackTrace("MicroMsg.ShareCardInfo", paramJSONObject, "", new Object[0]);
        }
      }
    }
  }
  
  private static LinkedList<lk> j(JSONArray paramJSONArray)
  {
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0)) {
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
      lk locallk = new lk();
      locallk.title = localJSONObject.optString("title");
      locallk.huX = localJSONObject.optString("sub_title");
      locallk.hyz = localJSONObject.optString("tips");
      locallk.url = localJSONObject.optString("url");
      locallk.roL = localJSONObject.optLong("show_flag");
      locallk.roM = localJSONObject.optString("primary_color");
      locallk.roN = localJSONObject.optString("secondary_color");
      locallk.lMY = localJSONObject.optString("icon_url");
      locallk.rnv = localJSONObject.optString("app_brand_user_name");
      locallk.rnw = localJSONObject.optString("app_brand_pass");
      localLinkedList.add(locallk);
      i += 1;
    }
    return localLinkedList;
  }
  
  private static LinkedList<pr> k(JSONArray paramJSONArray)
  {
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0)) {
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      pr localpr = D(paramJSONArray.getJSONObject(i));
      if (localpr != null) {
        localLinkedList.add(localpr);
      }
      i += 1;
    }
    return localLinkedList;
  }
  
  private static LinkedList<ax> l(JSONArray paramJSONArray)
  {
    LinkedList localLinkedList = new LinkedList();
    if (paramJSONArray != null)
    {
      int i = 0;
      for (;;)
      {
        if (i < paramJSONArray.length()) {
          try
          {
            ax localax = new ax();
            JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
            localax.text = localJSONObject.optString("text");
            localax.url = localJSONObject.optString("url");
            localLinkedList.add(localax);
            i += 1;
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              x.printErrStackTrace("MicroMsg.CardInfoParser", localJSONException, "", new Object[0]);
            }
          }
        }
      }
    }
    return localLinkedList;
  }
  
  public static ArrayList<ShareCardInfo> xN(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.CardInfoParser", "parseShareCardArray jsonContent is null");
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).optJSONArray("card_list");
      if ((paramString == null) || (paramString.length() == 0))
      {
        x.e("MicroMsg.CardInfoParser", "parseShareCardArray cardItemListJson is null");
        return null;
      }
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.CardInfoParser", paramString, "", new Object[0]);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramString.length())
    {
      JSONObject localJSONObject = paramString.optJSONObject(i);
      ShareCardInfo localShareCardInfo = new ShareCardInfo();
      a(localShareCardInfo, localJSONObject);
      localArrayList.add(localShareCardInfo);
      i += 1;
    }
    return localArrayList;
  }
  
  public static ArrayList<CardInfo> xO(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.CardInfoParser", "parseCardArray jsonContent is null");
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).optJSONArray("card_array");
      if ((paramString == null) || (paramString.length() == 0))
      {
        x.e("MicroMsg.CardInfoParser", "parseCardArray cardItemListJson is null");
        return null;
      }
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.CardInfoParser", paramString, "", new Object[0]);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramString.length())
    {
      JSONObject localJSONObject = paramString.optJSONObject(i);
      CardInfo localCardInfo = new CardInfo();
      a(localCardInfo, localJSONObject);
      localArrayList.add(localCardInfo);
      i += 1;
    }
    return localArrayList;
  }
  
  private static String xP(String paramString)
  {
    String str;
    if (!TextUtils.isEmpty(paramString))
    {
      str = paramString;
      if (!"null".equals(paramString)) {}
    }
    else
    {
      str = "";
    }
    return str;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */