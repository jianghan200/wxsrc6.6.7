package com.tencent.mm.plugin.hardwareopt.c;

import com.tencent.mm.protocal.c.amg;
import com.tencent.mm.protocal.c.atq;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.c.a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  implements a<Boolean, amg>
{
  private boolean kjk = false;
  
  public b(boolean paramBoolean)
  {
    this.kjk = paramBoolean;
  }
  
  private static String T(LinkedList<atq> paramLinkedList)
  {
    JSONArray localJSONArray1 = new JSONArray();
    if (paramLinkedList != null)
    {
      for (;;)
      {
        JSONObject localJSONObject;
        try
        {
          paramLinkedList = paramLinkedList.iterator();
          if (!paramLinkedList.hasNext()) {
            break;
          }
          Object localObject = (atq)paramLinkedList.next();
          if ((localObject == null) || (bi.oW(((atq)localObject).ldm))) {
            continue;
          }
          localJSONObject = new JSONObject();
          localJSONObject.put("mimeName", ((atq)localObject).ldm);
          JSONArray localJSONArray2 = new JSONArray();
          if (((atq)localObject).rWW != null)
          {
            localObject = ((atq)localObject).rWW.iterator();
            if (((Iterator)localObject).hasNext())
            {
              localJSONArray2.put((String)((Iterator)localObject).next());
              continue;
            }
          }
          localJSONObject.put("codecName", localJSONArray2);
        }
        catch (Exception paramLinkedList)
        {
          x.printErrStackTrace("MicroMsg.TaskReportHardwareInfo", paramLinkedList, "hy: error when build up json", new Object[0]);
          return "";
        }
        localJSONArray1.put(localJSONObject);
      }
      return localJSONArray1.toString();
    }
    x.w("MicroMsg.TaskReportHardwareInfo", "hy: no mime info retrieved!");
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/hardwareopt/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */