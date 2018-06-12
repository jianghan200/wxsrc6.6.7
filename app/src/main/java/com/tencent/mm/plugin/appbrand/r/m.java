package com.tencent.mm.plugin.appbrand.r;

import android.util.Base64;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.n;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m
{
  public static final boolean a(l paraml, Map paramMap, com.tencent.mm.plugin.appbrand.jsapi.b paramb)
  {
    if ((paraml == null) || (paramMap == null) || (paramb == null)) {
      return true;
    }
    AppBrandSysConfig localAppBrandSysConfig = paraml.fdO.fcu;
    int i = 0;
    d locald = (d)paraml.fdQ.y(d.class);
    JSONArray localJSONArray = new JSONArray();
    int k;
    Iterator localIterator;
    int j;
    label89:
    Object localObject2;
    Object localObject1;
    Object localObject3;
    if (((paramb instanceof n)) && (((n)paramb).fFo == Thread.currentThread()))
    {
      k = 1;
      localIterator = paramMap.entrySet().iterator();
      j = 0;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject2 = (Map.Entry)localIterator.next();
        localObject1 = (String)((Map.Entry)localObject2).getKey();
        localObject3 = ((Map.Entry)localObject2).getValue();
      } while ((localObject3 == null) || (!(localObject3 instanceof ByteBuffer)));
    }
    for (;;)
    {
      try
      {
        localObject2 = new JSONObject();
        ((JSONObject)localObject2).put("key", localObject1);
        if ((locald != null) && ((k == 0) || (locald.agi())))
        {
          m = locald.getNativeBufferId();
          if (m != -1)
          {
            localObject1 = (ByteBuffer)localObject3;
            if (localObject1 == null) {
              x.w("MicroMsg.NativeBufferUtil", "processNativeBufferToJs byteBuffer is null");
            }
          }
        }
      }
      catch (JSONException localJSONException1)
      {
        x.w("MicroMsg.NativeBufferUtil", "processNativeBuffer JSONException :%s", new Object[] { localJSONException1.getMessage() });
        localIterator.remove();
        break label89;
        k = 0;
        break;
        locald.setNativeBuffer(m, localJSONException1);
        ((JSONObject)localObject2).put("id", m);
        int m = localJSONException1.capacity();
        i += m;
        try
        {
          localJSONArray.put(localObject2);
          j = 1;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          boolean bool;
          for (;;) {}
        }
        catch (JSONException localJSONException2) {}
        ((JSONObject)localObject2).put("base64", new String(Base64.encode(((ByteBuffer)localObject3).array(), 2), "utf-8"));
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1) {}
      x.w("MicroMsg.NativeBufferUtil", "processNativeBuffer UnsupportedEncodingException :%s", new Object[] { localUnsupportedEncodingException1.getMessage() });
      continue;
      if (locald != null)
      {
        bool = true;
        x.i("MicroMsg.NativeBufferUtil", "ToJs useX5JSCore %b,bufferSize %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
        if (i <= localAppBrandSysConfig.frn.fpR) {
          break label511;
        }
        if (!(paramb instanceof h)) {
          break label492;
        }
        paramMap = new HashMap();
        paramMap.put("message", "convert native buffer parameter fail, event=" + paramb.getName() + ", error=native buffer exceed size limit");
        paramMap.put("stack", "");
        paraml.j("onError", new JSONObject(paramMap).toString(), 0);
      }
      for (;;)
      {
        return false;
        bool = false;
        break;
        label492:
        if ((paramb instanceof e)) {
          ((e)paramb).fEX = "fail convert native buffer parameter fail. native buffer exceed size limit";
        }
      }
      label511:
      if (j != 0) {
        paramMap.put("__nativeBuffers__", localJSONArray);
      }
      return true;
    }
  }
  
  public static final boolean a(l paraml, JSONObject paramJSONObject, com.tencent.mm.plugin.appbrand.jsapi.b paramb)
  {
    if ((paraml == null) || (paramJSONObject == null)) {}
    JSONArray localJSONArray;
    do
    {
      return true;
      localJSONArray = paramJSONObject.optJSONArray("__nativeBuffers__");
    } while (localJSONArray == null);
    paramJSONObject.remove("__nativeBuffers__");
    int m = localJSONArray.length();
    if (((paramb instanceof n)) && (((n)paramb).fFo == Thread.currentThread())) {}
    for (int j = 1;; j = 0)
    {
      int k = 0;
      int i = 0;
      for (;;)
      {
        if (k < m)
        {
          Object localObject = localJSONArray.optJSONObject(k);
          if (localObject != null)
          {
            String str = ((JSONObject)localObject).optString("key");
            if (!bi.oW(str))
            {
              int n = ((JSONObject)localObject).optInt("id", -1);
              if (n == -1) {}
              try
              {
                localObject = ((JSONObject)localObject).optString("base64", "");
                if (bi.oW((String)localObject))
                {
                  x.i("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs base64 is null");
                  paramJSONObject.put(str, ByteBuffer.allocate(0));
                }
                else
                {
                  paramJSONObject.put(str, ByteBuffer.wrap(Base64.decode(((String)localObject).getBytes(Charset.forName("UTF-8")), 2)));
                }
              }
              catch (JSONException localJSONException)
              {
                x.w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs JSONException :%s", new Object[] { localJSONException.getMessage() });
              }
              localObject = (d)paraml.fdQ.y(d.class);
              if (localObject == null)
              {
                x.w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs bufferAddon is null, not support");
                break label383;
              }
              if ((j != 0) && (!((d)localObject).agi()))
              {
                x.w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs bufferAddon sync operation not support");
                break label383;
              }
              localObject = ((d)localObject).getNativeBuffer(n);
              if (localObject == null)
              {
                x.w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs byteBuffer is null");
                break label383;
              }
              ((ByteBuffer)localObject).position(0);
              paramJSONObject.put(str, localObject);
              n = ((ByteBuffer)localObject).capacity();
              i = n + i;
              break label383;
            }
          }
        }
        else
        {
          x.i("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs bufferSize %d", new Object[] { Integer.valueOf(i) });
          if (i <= paraml.fdO.fcu.frn.fpR) {
            break;
          }
          if ((paramb instanceof e)) {
            ((e)paramb).fEX = "fail convert native buffer parameter fail. native buffer exceed size limit";
          }
          return false;
        }
        label383:
        k += 1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/r/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */