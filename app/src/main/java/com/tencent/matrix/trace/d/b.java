package com.tencent.matrix.trace.d;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.b.c;
import com.tencent.matrix.trace.b.d;
import com.tencent.matrix.trace.c.a.a;
import com.tencent.matrix.trace.core.MethodBeat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends a
  implements d, a.a
{
  final com.tencent.matrix.trace.a.a bsS;
  private final c btI;
  private final com.tencent.matrix.trace.c.a btJ;
  private final HashMap<Integer, a> btK;
  private HandlerThread btL;
  private volatile boolean btM;
  private boolean btN = true;
  private long btO;
  private final LinkedList<d> btP = new LinkedList();
  private Handler mHandler;
  
  public b(com.tencent.matrix.trace.a parama, com.tencent.matrix.trace.a.a parama1)
  {
    super(parama);
    this.bsS = parama1;
    this.btJ = new com.tencent.matrix.trace.c.a(com.tencent.matrix.d.a.tJ(), 5000L);
    this.btI = new MethodBeat();
    this.btO = this.btI.getFirstTime();
    this.btK = new HashMap();
  }
  
  private void a(f paramf, LinkedList<d> paramLinkedList)
  {
    if ((paramf == null) || (paramf.bue.isEmpty())) {}
    for (;;)
    {
      return;
      paramf = paramf.bue;
      while (!paramf.isEmpty())
      {
        f localf = (f)paramf.pop();
        paramLinkedList.addLast(localf.buc);
        a(localf, paramLinkedList);
      }
    }
  }
  
  private void a(g paramg, int paramInt1, int paramInt2, long[] paramArrayOfLong, com.tencent.matrix.trace.e.b.a parama, long paramLong1, long paramLong2)
  {
    paramInt1 = Math.max(0, paramInt1);
    paramInt2 = Math.min(paramArrayOfLong.length - 1, paramInt2);
    if (paramInt1 <= paramInt2)
    {
      long[] arrayOfLong = new long[paramInt2 - paramInt1 + 1];
      System.arraycopy(paramArrayOfLong, paramInt1, arrayOfLong, 0, paramInt2 - paramInt1 + 1);
      if (this.mHandler != null) {
        this.mHandler.post(new c(arrayOfLong, new b(paramg, parama, paramLong1, paramLong2), (byte)0));
      }
    }
  }
  
  private void a(g paramg, int paramInt, long[] paramArrayOfLong, long paramLong)
  {
    a(paramg, 0, paramInt, paramArrayOfLong, null, paramLong, System.nanoTime() / 1000000L - this.btI.getLastDiffTime());
  }
  
  private void tH()
  {
    if (!this.btN) {
      this.btI.reset();
    }
  }
  
  public final void a(Activity paramActivity, boolean paramBoolean, int paramInt, long[] paramArrayOfLong)
  {
    com.tencent.matrix.d.b.i("Matrix.EvilMethodTracer", "[onActivityEntered] activity:%s hashCode:%s isFocus:%s nowIndex:%s", new Object[] { paramActivity.getClass().getSimpleName(), Integer.valueOf(paramActivity.hashCode()), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    a locala;
    long l1;
    Object localObject;
    if ((paramBoolean) && (this.btK.containsKey(Integer.valueOf(paramActivity.hashCode()))))
    {
      long l2 = System.currentTimeMillis();
      locala = (a)this.btK.get(Integer.valueOf(paramActivity.hashCode()));
      l1 = l2 - locala.btQ;
      com.tencent.matrix.d.b.i("Matrix.EvilMethodTracer", "[activity load time] activity name:%s cost:%sms", new Object[] { paramActivity.getClass(), Long.valueOf(l1) });
      localObject = paramActivity.getClass().getSimpleName();
      if (this.btO <= 0L) {
        break label411;
      }
      l2 -= this.btO;
      com.tencent.matrix.d.b.i("Matrix.EvilMethodTracer", "[handleStartUp] startUpTime:%sms activityName:%s", new Object[] { Long.valueOf(l2), localObject });
      if (l2 >= this.bsS.btb) {
        a(g.buk, paramInt, paramArrayOfLong, l2);
      }
      this.mHandler.post(new e((String)localObject, l2));
      this.btO = -1L;
    }
    label411:
    for (int i = 1;; i = 0)
    {
      if ((i == 0) && (l1 >= this.bsS.btb))
      {
        localObject = paramActivity.getWindow().getDecorView();
        com.tencent.matrix.trace.e.b.a locala1 = new com.tencent.matrix.trace.e.b.a();
        com.tencent.matrix.trace.e.b.a(locala1, 0, (View)localObject);
        locala1.mActivityName = paramActivity.getClass().getSimpleName();
        com.tencent.matrix.d.b.w("Matrix.EvilMethodTracer", "[onActivityEntered] type:%s cost:%sms index:[%s-%s] viewInfo:%s", new Object[] { locala1.mActivityName, Long.valueOf(l1), Integer.valueOf(locala.index), Integer.valueOf(paramInt), locala1.toString() });
        a(g.buh, locala.index, paramInt, paramArrayOfLong, locala1, l1, System.nanoTime() / 1000000L - this.btI.getLastDiffTime());
      }
      this.btI.reset();
      this.btN = false;
      this.btK.remove(Integer.valueOf(paramActivity.hashCode()));
      return;
    }
  }
  
  public final void b(long[] paramArrayOfLong)
  {
    long l1 = System.nanoTime() / 1000000L;
    long l2 = this.btI.getLastDiffTime();
    this.btM = true;
    a(g.buj, 999999, paramArrayOfLong, l1 - l2 - paramArrayOfLong[0] & 0x7FFFFFFFFFF);
    this.btJ.cancel();
  }
  
  protected final String getTag()
  {
    return "Trace_EvilMethod";
  }
  
  public final void h(long paramLong1, long paramLong2)
  {
    if (this.btM)
    {
      this.btM = false;
      this.btN = false;
      this.btK.clear();
      tH();
      return;
    }
    int i = this.btI.getCurIndex();
    if (paramLong2 - paramLong1 > this.bsS.btd)
    {
      com.tencent.matrix.d.b.e("Matrix.EvilMethodTracer", "[doFrame] dropped frame too much! lastIndex:%s index:%s", new Object[] { Integer.valueOf(0), Integer.valueOf(i) });
      a(g.bug, i - 1, this.btI.getBuffer(), (paramLong2 - paramLong1) / 1000000L);
    }
    tH();
    this.btJ.cancel();
    this.btJ.a(this, false);
  }
  
  public final void onActivityCreated(Activity paramActivity)
  {
    com.tencent.matrix.d.b.i("Matrix.EvilMethodTracer", "[onActivityCreated] activity:%s hashCode:%s", new Object[] { paramActivity.getClass().getSimpleName(), Integer.valueOf(paramActivity.hashCode()) });
    super.onActivityCreated(paramActivity);
    this.btN = true;
    this.btK.put(Integer.valueOf(paramActivity.hashCode()), new a(System.currentTimeMillis(), Math.max(0, this.btI.getCurIndex() - 1), (byte)0));
  }
  
  public final void onActivityPause(Activity paramActivity)
  {
    super.onActivityPause(paramActivity);
    this.btK.remove(Integer.valueOf(paramActivity.hashCode()));
  }
  
  public final void onBackground(Activity paramActivity)
  {
    super.onBackground(paramActivity);
    this.btJ.cancel();
  }
  
  public final void onCreate()
  {
    super.onCreate();
    if (!this.btI.isRealTrace())
    {
      com.tencent.matrix.d.b.e("Matrix.EvilMethodTracer", "MethodBeat don't work, maybe it's wrong in trace Build!", new Object[0]);
      onDestroy();
      return;
    }
    if (this.btL == null)
    {
      this.btL = com.tencent.matrix.d.a.cd("matrix_trace_analyse_thread");
      this.mHandler = new Handler(this.btL.getLooper());
    }
    if (this.btI != null)
    {
      this.btI.registerListener(this);
      this.btI.onCreate();
    }
    this.btJ.cancel();
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    if (this.btL != null)
    {
      this.mHandler.removeCallbacksAndMessages(null);
      this.btL.quit();
      this.mHandler = null;
      this.btL = null;
    }
    this.btJ.cancel();
    if (this.btI != null)
    {
      this.btI.unregisterListener(this);
      this.btI.onDestroy();
    }
    this.btK.clear();
  }
  
  public final void tG()
  {
    long l1 = System.nanoTime() / 1000000L;
    long l2 = this.btI.getLastDiffTime();
    com.tencent.matrix.d.b.w("Matrix.EvilMethodTracer", "[onTimeExpire] maybe ANR!", new Object[0]);
    this.btM = true;
    this.btN = false;
    a(g.bui, 0, this.btI.getCurIndex() - 1, this.btI.getBuffer(), null, 5000L, l1 - l2);
  }
  
  private static final class a
  {
    long btQ;
    int index;
    
    private a(long paramLong, int paramInt)
    {
      this.btQ = paramLong;
      this.index = paramInt;
    }
  }
  
  private static final class b
  {
    b.g btR;
    com.tencent.matrix.trace.e.b.a btS;
    long btT;
    long btU;
    
    b(b.g paramg, com.tencent.matrix.trace.e.b.a parama, long paramLong1, long paramLong2)
    {
      this.btR = paramg;
      this.btS = parama;
      this.btT = paramLong1;
      this.btU = paramLong2;
    }
  }
  
  private final class c
    implements Runnable
  {
    private final long[] btV;
    private final b.b btW;
    
    private c(long[] paramArrayOfLong, b.b paramb)
    {
      this.btV = paramArrayOfLong;
      this.btW = paramb;
    }
    
    public final void run()
    {
      Object localObject3 = this.btV;
      Object localObject4 = new LinkedList();
      Object localObject2 = new LinkedList();
      int k = localObject3.length;
      int i = 0;
      label55:
      label81:
      long l1;
      label195:
      Object localObject5;
      if (i < k)
      {
        long l3 = localObject3[i];
        int j;
        if ((l3 >> 63 & 1L) == 1L)
        {
          j = 1;
          if (j == 0) {
            break label81;
          }
          ((LinkedList)localObject4).push(Long.valueOf(l3));
        }
        for (;;)
        {
          i += 1;
          break;
          j = 0;
          break label55;
          j = (int)(l3 >> 43 & 0xFFFFF);
          if (!((LinkedList)localObject4).isEmpty())
          {
            for (l1 = ((Long)((LinkedList)localObject4).pop()).longValue();; l1 = ((Long)((LinkedList)localObject4).pop()).longValue())
            {
              l2 = l1;
              if ((l1 >> 43 & 0xFFFFF) == j) {
                break label195;
              }
              com.tencent.matrix.d.b.w("Matrix.EvilMethodTracer", "[analyse] method[%s] not match in! continue to find!", new Object[] { Integer.valueOf(j) });
              if (((LinkedList)localObject4).isEmpty()) {
                break;
              }
            }
            com.tencent.matrix.d.b.e("Matrix.EvilMethodTracer", "[analyse] method[%s] not match in finally! ", new Object[] { Integer.valueOf(j) });
            long l2 = 0L;
            localObject5 = new b.d(j, (int)((l3 & 0x7FFFFFFFFFF) - (l2 & 0x7FFFFFFFFFF)), ((LinkedList)localObject4).size());
            localObject1 = null;
            if (!((LinkedList)localObject2).isEmpty()) {
              localObject1 = (b.d)((LinkedList)localObject2).peek();
            }
            if ((localObject1 != null) && (((b.d)localObject1).equals(localObject5)))
            {
              l1 = ((b.d)localObject5).btZ;
              ((b.d)localObject1).count += 1;
              ((b.d)localObject1).btZ = ((int)(l1 + ((b.d)localObject1).btZ));
            }
            else
            {
              ((LinkedList)localObject2).push(localObject5);
            }
          }
          else
          {
            com.tencent.matrix.d.b.w("Matrix.EvilMethodTracer", "[analyse] method[%s] not found in! ", new Object[] { Integer.valueOf(j) });
          }
        }
      }
      while (!((LinkedList)localObject4).isEmpty())
      {
        l1 = ((Long)((LinkedList)localObject4).pop()).longValue();
        ((LinkedList)localObject2).push(new b.d((int)(l1 >> 43 & 0xFFFFF), (int)(this.btW.btU - (l1 & 0x7FFFFFFFFFF)), ((LinkedList)localObject4).size()));
      }
      Object localObject1 = new LinkedList();
      b.a(b.this, b.a((LinkedList)localObject2), (LinkedList)localObject1);
      b.a(b.this, (LinkedList)localObject1, this.btW);
      if (((LinkedList)localObject1).isEmpty())
      {
        com.tencent.matrix.d.b.e("Matrix.EvilMethodTracer", "type:%s [stack result is empty after trim, just ignore]", new Object[] { this.btW.btR.name() });
        return;
      }
      localObject1 = ((LinkedList)localObject1).listIterator();
      localObject3 = new StringBuilder("\n");
      localObject2 = new StringBuilder();
      localObject4 = new StringBuilder();
      while (((ListIterator)localObject1).hasNext())
      {
        localObject5 = (b.d)((ListIterator)localObject1).next();
        ((StringBuilder)localObject3).append(((b.d)localObject5).print()).append('\n');
        ((StringBuilder)localObject2).append(((b.d)localObject5).toString()).append('\n');
        if (this.btW.btR != b.g.buj) {
          b.a(b.this, (StringBuilder)localObject4, (b.d)localObject5, ((ListIterator)localObject1).hasNext(), this.btW.btT);
        }
      }
      com.tencent.matrix.d.b.i("Matrix.EvilMethodTracer", "[analyse result] %s", new Object[] { ((StringBuilder)localObject3).toString() });
      localObject3 = ((StringBuilder)localObject4).toString();
      com.tencent.matrix.d.b.i("Matrix.EvilMethodTracer", "[analyse key] %s", new Object[] { localObject3 });
      for (;;)
      {
        try
        {
          localObject4 = new JSONObject();
          ((JSONObject)localObject4).put("machine", b.this.bsS.aA(b.this.btG.application));
          ((JSONObject)localObject4).put("detail", this.btW.btR.name());
          ((JSONObject)localObject4).put("cost", this.btW.btT);
          if (this.btW.btR == b.g.buh)
          {
            localObject5 = new JSONObject();
            localObject1 = this.btW.btS;
            if (localObject1 == null)
            {
              i = 0;
              ((JSONObject)localObject5).put("viewDeep", i);
              if (localObject1 != null) {
                break label870;
              }
              i = 0;
              ((JSONObject)localObject5).put("viewCount", i);
              if (localObject1 != null) {
                break label879;
              }
              localObject1 = Integer.valueOf(0);
              ((JSONObject)localObject5).put("activity", localObject1);
              ((JSONObject)localObject4).put("viewInfo", localObject5);
            }
          }
          else
          {
            ((JSONObject)localObject4).put("stack", ((StringBuilder)localObject2).toString());
            ((JSONObject)localObject4).put("stackKey", localObject3);
            b.this.b((JSONObject)localObject4);
            return;
          }
        }
        catch (JSONException localJSONException)
        {
          com.tencent.matrix.d.b.e("Matrix.EvilMethodTracer", "[JSONException for stack %s, error: %s", new Object[] { ((StringBuilder)localObject2).toString(), localJSONException });
          return;
        }
        i = localJSONException.buS;
        continue;
        label870:
        i = localJSONException.buR;
        continue;
        label879:
        String str = localJSONException.mActivityName;
      }
    }
  }
  
  private static final class d
  {
    int axZ;
    int btY;
    int btZ;
    int count = 1;
    
    d(int paramInt1, int paramInt2, int paramInt3)
    {
      this.btY = paramInt1;
      this.btZ = paramInt2;
      this.axZ = paramInt3;
    }
    
    public final boolean equals(Object paramObject)
    {
      if ((paramObject instanceof d))
      {
        paramObject = (d)paramObject;
        if ((((d)paramObject).btY == this.btY) && (((d)paramObject).axZ == this.axZ)) {
          return true;
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      return super.hashCode();
    }
    
    public final String print()
    {
      StringBuffer localStringBuffer = new StringBuffer();
      int i = 0;
      while (i < this.axZ)
      {
        localStringBuffer.append('.');
        i += 1;
      }
      return localStringBuffer.toString() + this.btY + " " + this.count + " " + this.btZ;
    }
    
    public final String toString()
    {
      return this.axZ + "," + this.btY + "," + this.count + "," + this.btZ;
    }
  }
  
  private final class e
    implements Runnable
  {
    long bua = 0L;
    String bub;
    
    e(String paramString, long paramLong)
    {
      this.bua = paramLong;
      this.bub = paramString;
    }
    
    public final void run()
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("machine", b.this.bsS.aA(b.this.btG.application));
        localJSONObject.put("cost", this.bua);
        localJSONObject.put("scene", this.bub);
        b localb = b.this;
        com.tencent.matrix.c.b localb1 = new com.tencent.matrix.c.b();
        localb1.tag = "Trace_StartUp";
        localb1.brm = localJSONObject;
        localb.btG.a(localb1);
        com.tencent.matrix.d.b.e("Matrix.EvilMethodTracer", "fuck", new Object[0]);
        return;
      }
      catch (JSONException localJSONException)
      {
        com.tencent.matrix.d.b.e("Matrix.EvilMethodTracer", "[JSONException for StartUpReportTask error: %s", new Object[] { localJSONException });
      }
    }
  }
  
  private static final class f
  {
    b.d buc;
    f bud;
    LinkedList<f> bue = new LinkedList();
    
    f(b.d paramd, f paramf)
    {
      this.buc = paramd;
      this.bud = paramf;
    }
  }
  
  private static enum g
  {
    private g() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/trace/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */