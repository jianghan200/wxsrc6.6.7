package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.mm.bt.g;
import com.tencent.mm.bt.g.a;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class o
  extends i<n>
  implements g.a
{
  public static final String[] diD = { i.a(n.dhO, "GoogleFriend") };
  public e diF;
  public m eKw = new o.1(this);
  
  public o(e parame)
  {
    super(parame, n.dhO, "GoogleFriend", null);
    this.diF = parame;
  }
  
  private boolean a(n paramn)
  {
    if (paramn == null) {}
    do
    {
      return false;
      paramn = paramn.wH();
    } while ((int)this.diF.insert("GoogleFriend", "googleitemid", paramn) <= 0);
    return true;
  }
  
  public final int a(g paramg)
  {
    if (paramg != null) {
      this.diF = paramg;
    }
    return 0;
  }
  
  public final boolean aa(String paramString, int paramInt)
  {
    paramString = "UPDATE GoogleFriend SET googlecgistatus='" + paramInt + "' WHERE googleitemid='" + paramString + "'";
    return this.diF.fV("GoogleFriend", paramString);
  }
  
  public final boolean ab(String paramString, int paramInt)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = "UPDATE GoogleFriend SET googlecgistatus='" + paramInt + "' , status='0' WHERE username='" + paramString + "'";
      return this.diF.fV("GoogleFriend", paramString);
    }
    return false;
  }
  
  public final boolean b(n paramn)
  {
    boolean bool1 = true;
    Object localObject = paramn.field_googleitemid;
    localObject = "SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend   WHERE GoogleFriend.googleitemid = \"" + bi.oU((String)localObject) + "\"";
    localObject = this.diF.b((String)localObject, null, 2);
    boolean bool2 = ((Cursor)localObject).moveToFirst();
    ((Cursor)localObject).close();
    if (!bool2) {
      bool1 = a(paramn);
    }
    int i;
    do
    {
      return bool1;
      localObject = paramn.wH();
      i = this.diF.update("GoogleFriend", (ContentValues)localObject, "googleitemid=?", new String[] { paramn.field_googleitemid });
      if (i > 0) {
        doNotify();
      }
    } while (i > 0);
    return false;
  }
  
  public final void clear()
  {
    this.diF.fV("GoogleFriend", " delete from GoogleFriend");
    this.eKw.b(5, this.eKw, "");
  }
  
  public final String getTableName()
  {
    return "GoogleFriend";
  }
  
  public final boolean h(ArrayList<n> paramArrayList)
  {
    if (paramArrayList.size() <= 0)
    {
      x.d("MicroMsg.GoogleContact.GoogleFriendUI", "insertList . list is null.");
      return false;
    }
    h localh = null;
    long l;
    if ((this.diF instanceof h))
    {
      localh = (h)this.diF;
      l = localh.dO(Thread.currentThread().getId());
      x.i("MicroMsg.GoogleContact.GoogleFriendUI", "surround insertList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      int i = 0;
      while (i < paramArrayList.size())
      {
        a((n)paramArrayList.get(i));
        i += 1;
      }
      if (localh != null)
      {
        localh.gp(l);
        x.i("MicroMsg.GoogleContact.GoogleFriendUI", "end updateList transaction");
      }
      this.eKw.b(2, this.eKw, "");
      return true;
      l = -1L;
    }
  }
  
  public final Cursor py(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString))
    {
      localStringBuilder.append(" WHERE ( ");
      localStringBuilder.append("GoogleFriend.googleid='" + paramString + "'");
      localStringBuilder.append(" ) ");
    }
    return this.diF.rawQuery("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend  " + localStringBuilder, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */