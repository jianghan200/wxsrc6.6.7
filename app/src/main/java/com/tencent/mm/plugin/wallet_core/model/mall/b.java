package com.tencent.mm.plugin.wallet_core.model.mall;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.protocal.d;
import com.tencent.mm.s.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.storage.aa.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public static int prX = 65280;
  public static int prY = 621019136;
  public static int prZ = 637534720;
  
  public static String bPJ()
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)ad.getContext().getSystemService("phone");
    if (localTelephonyManager != null) {
      return localTelephonyManager.getNetworkCountryIso();
    }
    return "";
  }
  
  public static boolean cE(List<a> paramList)
  {
    g.Ek();
    int j = ((Integer)g.Ei().DT().get(270342, Integer.valueOf(0))).intValue();
    if (paramList != null)
    {
      int i = paramList.size() - 1;
      while (i >= 0)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallLogic", "i:" + i + ", lastClickedListMaxId:" + j + ", actId:" + ((a)paramList.get(i)).prP);
        if (((a)paramList.get(i)).prP > j) {
          return true;
        }
        i -= 1;
      }
    }
    return false;
  }
  
  public static void cF(List<a> paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MallLogic", "func[setBannerRedDotClick] actList null or empty");
      return;
    }
    int i = ((a)paramList.get(0)).prP;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallLogic", "func[setBannerRedDotClick], lastClickedListMaxId" + i);
    g.Ek();
    g.Ei().DT().set(270342, Integer.valueOf(i));
    g.Ek();
    g.Ei().DT().lm(true);
  }
  
  public static ArrayList<MallNews> u(JSONArray paramJSONArray)
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      int j = paramJSONArray.length();
      int i = 0;
      Object localObject;
      for (;;)
      {
        localObject = localArrayList;
        if (i >= j) {
          break;
        }
        localObject = paramJSONArray.getJSONObject(i);
        MallNews localMallNews = new MallNews(((JSONObject)localObject).optString("activity_jump_funcid"));
        localMallNews.psf = ((JSONObject)localObject).optString("activity_icon_link");
        localMallNews.psd = ((JSONObject)localObject).optString("activity_msg_content");
        localMallNews.psh = ((JSONObject)localObject).optString("activity_tips");
        localArrayList.add(localMallNews);
        i += 1;
      }
      return (ArrayList<MallNews>)localObject;
    }
    catch (JSONException paramJSONArray)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.MallLogic", paramJSONArray, "", new Object[0]);
      localObject = null;
    }
  }
  
  public static ArrayList<a> v(JSONArray paramJSONArray)
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      int j = paramJSONArray.length();
      int i = 0;
      Object localObject;
      for (;;)
      {
        localObject = localArrayList;
        if (i >= j) {
          break;
        }
        localObject = paramJSONArray.getJSONObject(i);
        a locala = new a();
        locala.prP = ((JSONObject)localObject).optInt("banner_id");
        locala.prQ = ((JSONObject)localObject).optString("banner_title");
        locala.prR = ((JSONObject)localObject).optString("banner_link");
        localArrayList.add(locala);
        i += 1;
      }
      return (ArrayList<a>)localObject;
    }
    catch (JSONException paramJSONArray)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MallLogic", "func[parseBannerActList], exp:" + paramJSONArray.getMessage());
      localObject = null;
    }
  }
  
  public static SparseArray<String> w(JSONArray paramJSONArray)
  {
    int i = 0;
    try
    {
      SparseArray localSparseArray = new SparseArray();
      Object localObject;
      for (;;)
      {
        localObject = localSparseArray;
        if (i >= paramJSONArray.length()) {
          break;
        }
        localObject = paramJSONArray.getJSONObject(i);
        int j = ((JSONObject)localObject).optInt("type_id", 0);
        if (j != 0) {
          localSparseArray.put(j, ((JSONObject)localObject).optString("type_name"));
        }
        i += 1;
      }
      return (SparseArray<String>)localObject;
    }
    catch (JSONException paramJSONArray)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MallLogic", "func[parseBannerActList], exp:" + paramJSONArray.getMessage());
      localObject = null;
    }
  }
  
  public static ArrayList<MallFunction> x(JSONArray paramJSONArray)
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      int k = paramJSONArray.length();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallLogic", "functions.jsonArray.length : " + k);
      int i = 0;
      Object localObject1;
      for (;;)
      {
        localObject1 = localArrayList;
        if (i >= k) {
          break;
        }
        Object localObject2 = paramJSONArray.getJSONObject(i);
        localObject1 = new MallFunction();
        ((MallFunction)localObject1).moy = ((JSONObject)localObject2).getString("func_id");
        ((MallFunction)localObject1).cbR = ((JSONObject)localObject2).getString("func_name");
        ((MallFunction)localObject1).prS = ((JSONObject)localObject2).optString("func_icon_url");
        ((MallFunction)localObject1).kYQ = ((JSONObject)localObject2).optString("hd_icon_url");
        ((MallFunction)localObject1).kYR = ((JSONObject)localObject2).optString("func_foregroud_icon_url");
        ((MallFunction)localObject1).ceR = ((JSONObject)localObject2).optString("native_url");
        ((MallFunction)localObject1).kck = ((JSONObject)localObject2).optString("h5_url");
        ((MallFunction)localObject1).type = ((JSONObject)localObject2).optInt("property_type", 0);
        ((MallFunction)localObject1).prV = ((JSONObject)localObject2).optString("third_party_disclaimer");
        ((MallFunction)localObject1).prW = ((JSONObject)localObject2).optInt("download_restrict", 0);
        Object localObject3 = ((JSONObject)localObject2).optJSONArray("remark_name_list");
        if (localObject3 != null)
        {
          ((MallFunction)localObject1).prT = new ArrayList();
          int m = ((JSONArray)localObject3).length();
          int j = 0;
          while (j < m)
          {
            ((MallFunction)localObject1).prT.add(((JSONArray)localObject3).getString(j));
            j += 1;
          }
        }
        localObject3 = ((JSONObject)localObject2).optJSONArray("activity_info_list");
        if ((localObject3 != null) && (((JSONArray)localObject3).length() != 0))
        {
          localObject2 = ((MallFunction)localObject1).moy;
          localObject3 = ((JSONArray)localObject3).getJSONObject(0);
          localObject2 = new MallNews((String)localObject2);
          ((MallNews)localObject2).oqH = ((JSONObject)localObject3).optString("activity_id");
          ((MallNews)localObject2).bLe = ((JSONObject)localObject3).optString("activity_ticket");
          ((MallNews)localObject2).psd = ((JSONObject)localObject3).optString("activity_msg_content");
          ((MallNews)localObject2).pse = ((JSONObject)localObject3).optString("activity_link");
          ((MallNews)localObject2).psf = ((JSONObject)localObject3).optString("activity_icon_link");
          ((MallNews)localObject2).psg = ((JSONObject)localObject3).optInt("activity_expired_time");
          ((MallNews)localObject2).psh = ((JSONObject)localObject3).optString("activity_tips");
          ((MallNews)localObject2).ppS = ((JSONObject)localObject3).optInt("activity_type");
          ((MallNews)localObject2).psk = ((JSONObject)localObject3).optString("activity_url");
          ((MallNews)localObject2).psi = ((JSONObject)localObject3).optInt("is_msg_reserved");
          ((MallFunction)localObject1).prU = ((MallNews)localObject2);
        }
        localArrayList.add(localObject1);
        i += 1;
      }
      return (ArrayList<MallFunction>)localObject1;
    }
    catch (JSONException paramJSONArray)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.MallLogic", paramJSONArray, "", new Object[0]);
      localObject1 = null;
    }
  }
  
  public static void zn(int paramInt)
  {
    if ((d.qVN & prX) == paramInt)
    {
      g.Ek();
      i = ((Integer)g.Ei().DT().get(270343, Integer.valueOf(0))).intValue();
      if (paramInt != i) {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallLogic", "Mall reddot show, targetV=" + paramInt + ", clickedV=" + i);
      }
    }
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (q.GO()))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallLogic", "Show mall entry redot");
        c.Cp().u(262156, true);
        g.Ek();
        g.Ei().DT().set(270343, Integer.valueOf(paramInt));
        g.Ek();
        g.Ei().DT().a(aa.a.sXJ, Long.valueOf(System.currentTimeMillis()));
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/mall/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */