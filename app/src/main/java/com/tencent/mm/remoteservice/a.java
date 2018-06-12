package com.tencent.mm.remoteservice;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class a
  extends b.a
{
  private final d iMQ;
  protected RemoteService sCh;
  public b sCi;
  
  public a(d paramd)
  {
    this.iMQ = paramd;
  }
  
  public Object CLIENT_CALL(String paramString, Object... paramVarArgs)
  {
    paramVarArgs = objectsToBundle(paramVarArgs);
    try
    {
      this.sCi.onCallback(paramString, paramVarArgs, true);
      return paramVarArgs.get("result_key");
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        x.e("MicroMsg.BaseClientRequest", "exception:%s", new Object[] { bi.i(paramString) });
      }
    }
  }
  
  public Object REMOTE_CALL(String paramString, Object... paramVarArgs)
  {
    if (this.iMQ.isConnected())
    {
      paramVarArgs = objectsToBundle(paramVarArgs);
      this.iMQ.a(this, paramString, paramVarArgs);
      paramVarArgs.setClassLoader(getClass().getClassLoader());
      return paramVarArgs.get("result_key");
    }
    this.iMQ.K(new a.1(this, paramVarArgs, paramString));
    return null;
  }
  
  public Object[] getArgs(Bundle paramBundle)
  {
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    int j = paramBundle.size();
    while (i < j)
    {
      String str = String.valueOf(i);
      if (paramBundle.containsKey(str)) {
        localLinkedList.add(paramBundle.get(str));
      }
      i += 1;
    }
    return localLinkedList.toArray();
  }
  
  public Bundle objectsToBundle(Object... paramVarArgs)
  {
    Bundle localBundle = new Bundle();
    int j = paramVarArgs.length;
    int i = 0;
    if (i < j)
    {
      if ((paramVarArgs[i] instanceof Bundle)) {
        localBundle.putBundle(String.valueOf(i), (Bundle)paramVarArgs[i]);
      }
      for (;;)
      {
        i += 1;
        break;
        if ((paramVarArgs[i] instanceof Parcelable)) {
          localBundle.putParcelable(String.valueOf(i), (Parcelable)paramVarArgs[i]);
        } else {
          localBundle.putSerializable(String.valueOf(i), (Serializable)paramVarArgs[i]);
        }
      }
    }
    return localBundle;
  }
  
  public void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    x.d("MicroMsg.BaseClientRequest", "class:%s, method:%s, clientCall:%B", new Object[] { getClass().getName(), paramString, Boolean.valueOf(paramBoolean) });
    Object localObject2 = null;
    for (;;)
    {
      int i;
      Object localObject1;
      try
      {
        Method[] arrayOfMethod = getClass().getMethods();
        int j = arrayOfMethod.length;
        i = 0;
        localObject1 = localObject2;
        if (i >= j) {
          break label154;
        }
        localObject1 = arrayOfMethod[i];
        if (!((Method)localObject1).getName().equalsIgnoreCase(paramString)) {
          break label170;
        }
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.BaseClientRequest", "exception:%s", new Object[] { bi.i(paramString) });
        return;
      }
      if (((Method)localObject1).isAnnotationPresent(paramString))
      {
        paramString = ((Method)localObject1).invoke(this, getArgs(paramBundle));
        if (((Method)localObject1).getReturnType() != Void.TYPE)
        {
          paramBundle.putSerializable("result_key", (Serializable)paramString);
          return;
          paramString = f.class;
          continue;
          label154:
          if (localObject1 != null)
          {
            if (!paramBoolean) {
              continue;
            }
            paramString = e.class;
            continue;
          }
        }
      }
      return;
      label170:
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/remoteservice/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */