package com.tencent.matrix.b;

import android.app.Application;
import com.tencent.matrix.c.c.a;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b
  implements c.a
{
  public Application application;
  private c boU;
  public boolean brg = true;
  public int status = 0;
  
  private boolean tx()
  {
    return this.status == 8;
  }
  
  public void a(Application paramApplication, c paramc)
  {
    if ((this.application != null) || (this.boU != null)) {
      throw new RuntimeException("plugin duplicate init, application or plugin listener is not null");
    }
    this.status = 1;
    this.application = paramApplication;
    this.boU = paramc;
  }
  
  public final void a(com.tencent.matrix.c.b paramb)
  {
    if (paramb.tag == null) {
      paramb.tag = getTag();
    }
    paramb.brn = this;
    JSONObject localJSONObject = paramb.brm;
    try
    {
      if (paramb.tag != null) {
        localJSONObject.put("tag", paramb.tag);
      }
      if (paramb.brl != null) {
        localJSONObject.put("type", paramb.brl);
      }
      localJSONObject.put("process", com.tencent.matrix.d.c.aC(this.application));
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        com.tencent.matrix.d.b.e("Matrix.Plugin", "json error", new Object[] { localJSONException });
      }
    }
    this.boU.b(paramb);
  }
  
  public String getTag()
  {
    return getClass().getName();
  }
  
  public void start()
  {
    if (tx()) {
      throw new RuntimeException("plugin start, but plugin has been already destroyed");
    }
    if (tw()) {
      throw new RuntimeException("plugin start, but plugin has been already started");
    }
    this.status = 2;
    if (this.boU == null) {
      throw new RuntimeException("plugin start, plugin listener is null");
    }
    this.boU.c(this);
  }
  
  public void stop()
  {
    if (tx()) {
      throw new RuntimeException("plugin stop, but plugin has been already destroyed");
    }
    if (!tw()) {
      throw new RuntimeException("plugin stop, but plugin is never started");
    }
    this.status = 4;
    if (this.boU == null) {
      throw new RuntimeException("plugin stop, plugin listener is null");
    }
    this.boU.d(this);
  }
  
  public final boolean tw()
  {
    return this.status == 2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */