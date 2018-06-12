package com.tencent.mm.ac;

import android.graphics.Bitmap;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.aa.q;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.hr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static boolean LP()
  {
    Object localObject = g.Ei().DT().get(aa.a.sQF, null);
    if ((localObject == null) || (!(localObject instanceof Integer))) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizAttrRenovator", "openFlag is null.");
    }
    for (int i = 1;; i = ((Integer)localObject).intValue())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizAttrRenovator", "openFlag is %d.", new Object[] { Integer.valueOf(i) });
      if (i != 1) {
        break;
      }
      return true;
    }
    return false;
  }
  
  public static boolean a(ab paramab, d paramd, List<hr> paramList)
  {
    if ((paramab == null) || (paramList == null) || (paramList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BizAttrRenovator", "updateBizAttributes failed.");
      return false;
    }
    String str1 = paramab.field_username;
    if (!paramab.ckW())
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BizAttrRenovator", "updateBizAttributes failed, contact is not a biz contact.(username : %s)", new Object[] { str1 });
      return false;
    }
    d locald = paramd;
    if (paramd == null) {
      locald = z.MY().kA(str1);
    }
    if (locald == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizAttrRenovator", "BizInfo is null.(username : %s)", new Object[] { str1 });
      return false;
    }
    j localj = q.KH().kc(str1);
    long l1;
    int i;
    int k;
    hr localhr;
    try
    {
      if (bi.oW(locald.field_extInfo)) {}
      for (paramd = new JSONObject();; paramd = new JSONObject(locald.field_extInfo))
      {
        l1 = -1L;
        l2 = paramab.field_type;
        i = 0;
        paramList = paramList.iterator();
        k = 0;
        for (;;)
        {
          if (!paramList.hasNext()) {
            break label711;
          }
          localhr = (hr)paramList.next();
          if (localhr != null) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BizAttrRenovator", "keyValue is null.");
        }
      }
    }
    catch (Exception paramd)
    {
      String str2;
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BizAttrRenovator", "create Json object from extInfo error. %s.", new Object[] { paramd });
        paramd = new JSONObject();
        continue;
        str2 = localhr.riD;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizAttrRenovator", "[BizAttr] UpdateInfoList key = %s, value = %s", new Object[] { str2, localhr.mEl });
        String str3 = localhr.mEl;
        if (!"UserName".equals(str2))
        {
          if ("NickName".equals(str2)) {
            paramab.dx(str3);
          }
        }
        else
        {
          label292:
          j = 1;
          label295:
          if ((j == 0) && (!b(paramd, str2, localhr.mEl)))
          {
            str3 = localhr.mEl;
            if (!"BrandInfo".equals(str2)) {
              break label480;
            }
            locald.field_brandInfo = str3;
            label338:
            j = 1;
          }
        }
        for (;;)
        {
          if (j == 0) {
            break label573;
          }
          i += 1;
          break;
          if ("Alias".equals(str2))
          {
            paramab.du(str3);
            break label292;
          }
          if ("PYInitial".equals(str2))
          {
            paramab.dy(str3);
            break label292;
          }
          if ("QuanPin".equals(str2))
          {
            paramab.dz(str3);
            break label292;
          }
          if ("VerifyFlag".equals(str2))
          {
            paramab.eF(bi.getInt(str3, paramab.field_verifyFlag));
            break label292;
          }
          if ("VerifyInfo".equals(str2))
          {
            paramab.dR(str3);
            break label292;
          }
          if ("Signature".equals(str2))
          {
            paramab.dM(str3);
            break label292;
          }
          j = 0;
          break label295;
          label480:
          if ("BrandIconURL".equals(str2))
          {
            locald.field_brandIconURL = str3;
            break label338;
          }
          if ("BrandFlag".equals(str2))
          {
            locald.field_brandFlag = bi.getInt(str3, locald.field_brandFlag);
            break label338;
          }
          if ("Appid".equals(str2))
          {
            if (str3.equals(locald.field_appId))
            {
              j = 0;
              continue;
            }
            locald.field_appId = str3;
            break label338;
          }
          j = 0;
        }
        label573:
        str3 = localhr.mEl;
        if ("BigHeadImgUrl".equals(str2)) {
          if (localj != null) {
            localj.dHR = str3;
          }
        }
        label602:
        for (int j = 1;; j = 0)
        {
          if (j == 0) {
            break label651;
          }
          i += 1;
          k = 1;
          break;
          if ("SmallHeadImgUrl".equals(str2))
          {
            if (localj == null) {
              break label602;
            }
            localj.dHQ = str3;
            break label602;
          }
        }
        label651:
        if (!"BitMask".equals(str2)) {
          break;
        }
        l1 = bi.getLong(localhr.mEl, l1);
        i += 1;
      }
      if (!"BitVal".equals(str2)) {
        break label906;
      }
    }
    long l2 = bi.getLong(localhr.mEl, l2);
    i += 1;
    label711:
    label906:
    for (;;)
    {
      break;
      if (i == 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizAttrRenovator", "None attribute has been updated.");
        return false;
      }
      locald.field_extInfo = paramd.toString();
      if ((localj != null) && (k != 0))
      {
        q.KH().a(localj);
        q.Kp();
        f.B(str1, false);
        q.Kp();
        f.B(str1, true);
        q.KJ().jO(str1);
        paramd = z.Ni();
        if (!bi.oW(str1))
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BrandLogic", "remove cache by brandKey : %s", new Object[] { str1 });
          paramd = (WeakReference)paramd.dMz.remove(str1);
          if (paramd != null)
          {
            paramd = (Bitmap)paramd.get();
            if (paramd != null) {
              paramd.isRecycled();
            }
          }
        }
      }
      paramab.setType(paramab.field_type | (int)(l1 & l2));
      ((i)g.l(i.class)).FR().a(str1, paramab);
      z.MY().e(locald);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizAttrRenovator", "Update bizInfo attributes successfully.");
      return true;
    }
  }
  
  static boolean b(d paramd)
  {
    if (paramd == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizAttrRenovator", "BizInfo is null.");
      return false;
    }
    if (!LP()) {
      return false;
    }
    int j = ((com.tencent.mm.plugin.zero.b.a)g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getInt("MMBizAttrSyncFreq", -1);
    int i = j;
    if (j == -1)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizAttrRenovator", "MMBizAttrSyncFreq is null.");
      i = 3600;
    }
    long l1 = System.currentTimeMillis();
    long l2 = paramd.field_incrementUpdateTime;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizAttrRenovator", "currentMS(%d), lastUpdateTime(%d), freq(%d), version(%s).", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), paramd.field_attrSyncVersion });
    return l1 - l2 >= i * 1000L;
  }
  
  private static boolean b(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    boolean bool = false;
    try
    {
      if ("IsShowHeadImgInMsg".equals(paramString1)) {
        paramJSONObject.put(paramString1, paramString2);
      } else if ("IsHideInputToolbarInMsg".equals(paramString1)) {
        paramJSONObject.put(paramString1, paramString2);
      }
    }
    catch (JSONException paramJSONObject)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BizAttrRenovator", "updateExtInfoAttrs failed, key(%s) value(%s), exception : %s.", new Object[] { paramString1, paramString2, paramJSONObject });
    }
    if (!"IsAgreeProtocol".equals(paramString1)) {
      if ("InteractiveMode".equals(paramString1)) {
        paramJSONObject.put(paramString1, bi.getInt(paramString2, paramJSONObject.optInt(paramString1)));
      } else if ("CanReceiveSpeexVoice".equals(paramString1)) {
        paramJSONObject.put(paramString1, paramString2);
      } else if ("ConnectorMsgType".equals(paramString1)) {
        paramJSONObject.put(paramString1, bi.getInt(paramString2, paramJSONObject.optInt(paramString1)));
      } else if ("ReportLocationType".equals(paramString1)) {
        paramJSONObject.put(paramString1, bi.getInt(paramString2, paramJSONObject.optInt(paramString1)));
      } else if ("AudioPlayType".equals(paramString1)) {
        paramJSONObject.put(paramString1, bi.getInt(paramString2, paramJSONObject.optInt(paramString1)));
      } else if ("IsShowMember".equals(paramString1)) {
        paramJSONObject.put(paramString1, paramString2);
      } else if ("ConferenceContactExpireTime".equals(paramString1)) {
        paramJSONObject.put(paramString1, paramString2);
      } else if (!"VerifyMsg2Remark".equals(paramString1)) {
        if ("VerifyContactPromptTitle".equals(paramString1)) {
          paramJSONObject.put(paramString1, paramString2);
        } else if (!"IsSubscribeStat".equals(paramString1)) {
          if ("ScanQRCodeType".equals(paramString1)) {
            paramJSONObject.put(paramString1, bi.getInt(paramString2, paramJSONObject.optInt(paramString1)));
          } else if ("ServiceType".equals(paramString1)) {
            paramJSONObject.put(paramString1, bi.getInt(paramString2, paramJSONObject.optInt(paramString1)));
          } else if (!"NeedShowUserAddrObtaining".equals(paramString1)) {
            if ("SupportEmoticonLinkPrefix".equals(paramString1)) {
              paramJSONObject.put(paramString1, paramString2);
            } else if ("FunctionFlag".equals(paramString1)) {
              paramJSONObject.put(paramString1, bi.getInt(paramString2, paramJSONObject.optInt(paramString1)));
            } else if ("NotifyManage".equals(paramString1)) {
              paramJSONObject.put(paramString1, paramString2);
            } else if ("ServicePhone".equals(paramString1)) {
              paramJSONObject.put(paramString1, paramString2);
            } else if ("IsTrademarkProtection".equals(paramString1)) {
              paramJSONObject.put(paramString1, paramString2);
            } else if (!"CanReceiveLongVideo".equals(paramString1)) {
              if ("TrademarkUrl".equals(paramString1)) {
                paramJSONObject.put(paramString1, paramString2);
              } else if ("TrademarkName".equals(paramString1)) {
                paramJSONObject.put(paramString1, paramString2);
              } else if ("MMBizMenu".equals(paramString1)) {
                paramJSONObject.put(paramString1, paramString2);
              } else if ("VerifySource".equals(paramString1)) {
                paramJSONObject.put(paramString1, paramString2);
              } else if (!"MMBizTabbar".equals(paramString1)) {
                if ("PayShowInfo".equals(paramString1)) {
                  paramJSONObject.put(paramString1, paramString2);
                } else if ("HardwareBizInfo".equals(paramString1)) {
                  paramJSONObject.put(paramString1, paramString2);
                } else if ("EnterpriseBizInfo".equals(paramString1)) {
                  paramJSONObject.put(paramString1, paramString2);
                } else if (!"MainPage".equals(paramString1)) {
                  if ("RegisterSource".equals(paramString1)) {
                    paramJSONObject.put(paramString1, paramString2);
                  } else if (!"IBeaconBizInfo".equals(paramString1)) {
                    if ("WxaAppInfo".equals(paramString1))
                    {
                      paramJSONObject.put(paramString1, paramString2);
                    }
                    else if ("WxaAppVersionInfo".equals(paramString1))
                    {
                      paramJSONObject.put(paramString1, paramString2);
                    }
                    else if ("WXAppType".equals(paramString1))
                    {
                      paramJSONObject.put(paramString1, paramString2);
                    }
                    else if ("BindWxaInfo".equals(paramString1))
                    {
                      paramJSONObject.put(paramString1, paramString2);
                    }
                    else
                    {
                      if (!"AcctTransferInfo".equals(paramString1)) {
                        return bool;
                      }
                      paramJSONObject.put(paramString1, paramString2);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    bool = true;
    return bool;
  }
  
  public final boolean km(String paramString)
  {
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes failed, username is null or nil.");
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes");
    d locald = z.MY().kA(paramString);
    if (!b(locald))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizAttrRenovator", "do not need to update biz attrs now.");
      return false;
    }
    WeakReference localWeakReference = new WeakReference(null);
    g.Eh().dpP.a(new p(paramString, locald.field_attrSyncVersion, new a.1(this, localWeakReference, paramString)), 0);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ac/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */