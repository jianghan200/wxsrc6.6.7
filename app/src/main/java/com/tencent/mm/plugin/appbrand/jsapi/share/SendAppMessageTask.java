package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.a.e;
import com.tencent.mm.a.o;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.v;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.af;
import com.tencent.mm.model.s;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.cgm;
import com.tencent.mm.protocal.c.cgn;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.y.d;
import com.tencent.mm.y.g.a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SendAppMessageTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<SendAppMessageTask> CREATOR = new SendAppMessageTask.2();
  public String appId;
  public String bGG;
  public int bPh;
  public int dCn;
  public String description;
  public String dxx;
  public Runnable fFC;
  public boolean fPt;
  public String fYU;
  public String fYV;
  public String fYW;
  public int fYX;
  public String fYY;
  public String fYZ;
  public String fZa;
  public boolean fZb;
  public boolean fZc;
  public String fZd;
  public ArrayList<ShareInfo> fZe;
  public String fso;
  public String fwS;
  public String iconUrl;
  public String nickname;
  public String path;
  public int scene = 1000;
  public String title;
  public String toUser;
  public int type;
  public String url;
  public String userName;
  public int version;
  public boolean withShareTicket;
  
  public SendAppMessageTask() {}
  
  protected SendAppMessageTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  private void a(g.a parama, byte[] paramArrayOfByte, String paramString, StringBuilder paramStringBuilder, int paramInt)
  {
    ((com.tencent.mm.plugin.appbrand.compat.a.a)g.l(com.tencent.mm.plugin.appbrand.compat.a.a.class)).a(parama, this.appId, this.title, paramString, paramArrayOfByte);
    if (!bi.oW(this.fYU))
    {
      parama = new ow();
      parama.bZQ.bZR = paramString;
      parama.bZQ.content = this.fYU;
      parama.bZQ.type = s.hQ(paramString);
      parama.bZQ.flags = 0;
      com.tencent.mm.sdk.b.a.sFg.m(parama);
    }
    int i = 1;
    if (paramString.toLowerCase().endsWith("@chatroom"))
    {
      parama = ((com.tencent.mm.plugin.chatroom.b.b)g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().il(paramString);
      if (parama == null) {
        break label206;
      }
    }
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    String str9;
    String str1;
    label206:
    for (i = parama.size();; i = 0)
    {
      str2 = this.appId;
      str3 = this.bGG;
      str4 = this.fYY;
      str5 = this.title;
      str6 = this.path;
      str7 = this.fYZ;
      str8 = this.fZa;
      str9 = paramStringBuilder.toString();
      str1 = this.fZd;
      if (!bi.oW(str2)) {
        break;
      }
      x.e("MicroMsg.SendAppMessageTask", "appId is Null!");
      return;
    }
    parama = "";
    try
    {
      paramArrayOfByte = p.encode(bi.oV(str6), "UTF-8");
      parama = paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      for (;;)
      {
        x.e("MicroMsg.SendAppMessageTask", "encode share page path error!");
      }
    }
    paramArrayOfByte = "";
    try
    {
      paramStringBuilder = p.encode(bi.oV(str7), "UTF-8");
      paramArrayOfByte = paramStringBuilder;
    }
    catch (UnsupportedEncodingException paramStringBuilder)
    {
      for (;;)
      {
        x.e("MicroMsg.SendAppMessageTask", "encode current page path error!");
      }
    }
    paramStringBuilder = "";
    try
    {
      str1 = p.encode(bi.oV(str1), "UTF-8");
      paramStringBuilder = str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        x.e("MicroMsg.SendAppMessageTask", "encode current html url error!");
      }
    }
    x.d("MicroMsg.SendAppMessageTask", "stev report(%s), appId %s, scene %s, sceneNote %s, sessionId %s, currentPath %s, currentTitle %s,shareTitle %s, sharePath %s, shareActionId %s, destinationUserCount %s, destinationUserName %s", new Object[] { Integer.valueOf(14077), str2, Integer.valueOf(paramInt), str3, str4, str7, str8, str5, str6, str9, Integer.valueOf(i), paramString });
    h.mEJ.h(14077, new Object[] { str2, Integer.valueOf(paramInt), str3, str4, paramArrayOfByte, str8, str5, parama, str9, "", Integer.valueOf(i), paramString, paramStringBuilder });
  }
  
  private void a(g.a parama, byte[] paramArrayOfByte, StringBuilder paramStringBuilder, int paramInt, boolean paramBoolean, String paramString)
  {
    b.a locala = new b.a();
    locala.dIF = 1118;
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getshareinfo";
    cgm localcgm = new cgm();
    localcgm.bPS = this.appId;
    LinkedList localLinkedList = new LinkedList(bi.F(this.toUser.split(",")));
    localcgm.sAI = localLinkedList;
    localcgm.sAK = paramString;
    localcgm.sAJ = paramBoolean;
    locala.dIG = localcgm;
    locala.dIH = new cgn();
    v.a(locala.KT(), new SendAppMessageTask.1(this, localLinkedList, parama, paramArrayOfByte, paramStringBuilder, paramInt));
  }
  
  public final void aai()
  {
    x.i("MicroMsg.SendAppMessageTask", "username = %s, thumbIconUrl = %s", new Object[] { this.userName, this.fYV });
    Object localObject2 = new byte[0];
    Object localObject1;
    if ((!bi.oW(this.fYV)) && ((this.fYV.startsWith("http://")) || (this.fYV.startsWith("https://")))) {
      localObject1 = com.tencent.mm.modelappbrand.b.b.Ka().a(this.fYV, null);
    }
    for (;;)
    {
      Object localObject3;
      if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
      {
        x.i("MicroMsg.SendAppMessageTask", "thumb image is not null ");
        localObject2 = Bitmap.createBitmap(((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight(), Bitmap.Config.ARGB_8888);
        localObject3 = new Canvas((Bitmap)localObject2);
        ((Canvas)localObject3).drawColor(-1);
        ((Canvas)localObject3).drawBitmap((Bitmap)localObject1, 0.0F, 0.0F, null);
        localObject1 = new ByteArrayOutputStream();
        ((Bitmap)localObject2).compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)localObject1);
        localObject1 = ((ByteArrayOutputStream)localObject1).toByteArray();
        ((Bitmap)localObject2).recycle();
        label165:
        x.i("MicroMsg.SendAppMessageTask", "doSendMessage, appId : %s, title = %s, description = %s ,username = %s ,path = %s, thumbIconUrl = %s", new Object[] { this.appId, this.title, this.description, this.userName, this.path, this.fYV });
        localObject2 = u.ic("wxapp_" + this.appId + this.path);
        u.Hx().v((String)localObject2, true).p("prePublishId", "wxapp_" + this.appId + this.path);
        localObject2 = new g.a();
        ((g.a)localObject2).title = this.title;
        ((g.a)localObject2).description = this.description;
        ((g.a)localObject2).type = 33;
        ((g.a)localObject2).dyS = this.userName;
        ((g.a)localObject2).dyR = this.path;
        ((g.a)localObject2).dyT = this.appId;
        ((g.a)localObject2).dyZ = this.bPh;
        ((g.a)localObject2).dza = this.version;
        ((g.a)localObject2).dyV = this.fso;
        ((g.a)localObject2).dyU = this.type;
        ((g.a)localObject2).url = this.url;
        ((g.a)localObject2).dzb = this.iconUrl;
        ((g.a)localObject2).bZM = ("wxapp_" + this.appId + this.path);
        ((g.a)localObject2).bZG = this.userName;
        ((g.a)localObject2).bZH = this.nickname;
        localObject3 = new com.tencent.mm.y.a();
        ((com.tencent.mm.y.a)localObject3).dvC = this.fZb;
        ((com.tencent.mm.y.a)localObject3).dvD = this.fwS;
        ((com.tencent.mm.y.a)localObject3).dvE = this.dCn;
        ((com.tencent.mm.y.a)localObject3).dvF = this.fZc;
        ((g.a)localObject2).a((d)localObject3);
        localObject3 = new StringBuilder("1_");
        ((StringBuilder)localObject3).append(this.appId);
        ((StringBuilder)localObject3).append("_");
        g.Eg();
        ((StringBuilder)localObject3).append(o.getString(com.tencent.mm.kernel.a.Df()));
        ((StringBuilder)localObject3).append("_");
        ((StringBuilder)localObject3).append(bi.VE());
        ((StringBuilder)localObject3).append("_");
        ((StringBuilder)localObject3).append(this.fYX);
        ((g.a)localObject2).dyX = ((StringBuilder)localObject3).toString();
        x.i("MicroMsg.SendAppMessageTask", "doSendMessage isUpdateMsg:%b, withShareTicket:%b", new Object[] { Boolean.valueOf(this.fZc), Boolean.valueOf(this.withShareTicket) });
        if ((!this.fZc) || (!this.withShareTicket)) {
          break label750;
        }
        a((g.a)localObject2, (byte[])localObject1, (StringBuilder)localObject3, this.scene, this.fZc, this.dxx);
      }
      for (;;)
      {
        return;
        if (bi.oW(this.fYW)) {
          break label838;
        }
        localObject1 = c.Wb(this.fYW);
        if (this.fPt)
        {
          boolean bool = e.deleteFile(this.fYW);
          x.v("MicroMsg.SendAppMessageTask", "decode thumb icon bitmap by path(%s), and deleted(%s) file.", new Object[] { this.fYW, Boolean.valueOf(bool) });
          break;
        }
        x.v("MicroMsg.SendAppMessageTask", "decode thumb icon bitmap by path(%s)", new Object[] { this.fYW });
        break;
        x.e("MicroMsg.SendAppMessageTask", "thumb image is null");
        localObject1 = localObject2;
        break label165;
        label750:
        if (this.withShareTicket)
        {
          a((g.a)localObject2, (byte[])localObject1, (StringBuilder)localObject3, this.scene, this.fZc, this.dxx);
          return;
        }
        Iterator localIterator = new LinkedList(bi.F(this.toUser.split(","))).iterator();
        while (localIterator.hasNext()) {
          a((g.a)localObject2, (byte[])localObject1, (String)localIterator.next(), (StringBuilder)localObject3, this.scene);
        }
      }
      label838:
      localObject1 = null;
    }
  }
  
  public final void aaj()
  {
    if (this.fFC != null) {
      this.fFC.run();
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void g(Parcel paramParcel)
  {
    boolean bool2 = true;
    this.appId = paramParcel.readString();
    this.userName = paramParcel.readString();
    this.title = paramParcel.readString();
    this.description = paramParcel.readString();
    this.fYU = paramParcel.readString();
    this.toUser = paramParcel.readString();
    this.url = paramParcel.readString();
    this.path = paramParcel.readString();
    this.type = paramParcel.readInt();
    this.fYV = paramParcel.readString();
    this.iconUrl = paramParcel.readString();
    this.fYW = paramParcel.readString();
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.fPt = bool1;
      this.bPh = paramParcel.readInt();
      this.fso = paramParcel.readString();
      this.version = paramParcel.readInt();
      this.nickname = paramParcel.readString();
      this.fYX = paramParcel.readInt();
      this.scene = paramParcel.readInt();
      this.bGG = paramParcel.readString();
      this.fYY = paramParcel.readString();
      this.fYZ = paramParcel.readString();
      this.fZa = paramParcel.readString();
      if (paramParcel.readByte() != 1) {
        break label289;
      }
      bool1 = true;
      label203:
      this.withShareTicket = bool1;
      if (paramParcel.readInt() != 1) {
        break label294;
      }
      bool1 = true;
      label218:
      this.fZb = bool1;
      if (paramParcel.readInt() != 1) {
        break label299;
      }
    }
    label289:
    label294:
    label299:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.fZc = bool1;
      this.dxx = paramParcel.readString();
      this.fwS = paramParcel.readString();
      this.dCn = paramParcel.readInt();
      this.fZd = paramParcel.readString();
      this.fZe = paramParcel.readArrayList(SendAppMessageTask.class.getClassLoader());
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label203;
      bool1 = false;
      break label218;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.userName);
    paramParcel.writeString(this.title);
    paramParcel.writeString(this.description);
    paramParcel.writeString(this.fYU);
    paramParcel.writeString(this.toUser);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.path);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.fYV);
    paramParcel.writeString(this.iconUrl);
    paramParcel.writeString(this.fYW);
    if (this.fPt)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.bPh);
      paramParcel.writeString(this.fso);
      paramParcel.writeInt(this.version);
      paramParcel.writeString(this.nickname);
      paramParcel.writeInt(this.fYX);
      paramParcel.writeInt(this.scene);
      paramParcel.writeString(this.bGG);
      paramParcel.writeString(this.fYY);
      paramParcel.writeString(this.fYZ);
      paramParcel.writeString(this.fZa);
      if (!this.withShareTicket) {
        break label287;
      }
      paramInt = 1;
      label207:
      paramParcel.writeByte((byte)paramInt);
      if (!this.fZb) {
        break label292;
      }
      paramInt = 1;
      label222:
      paramParcel.writeInt(paramInt);
      if (!this.fZc) {
        break label297;
      }
    }
    label287:
    label292:
    label297:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.dxx);
      paramParcel.writeString(this.fwS);
      paramParcel.writeInt(this.dCn);
      paramParcel.writeString(this.fZd);
      paramParcel.writeList(this.fZe);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label207;
      paramInt = 0;
      break label222;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/SendAppMessageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */