package com.tencent.mm.plugin.exdevice.f.b.a;

import com.tencent.mm.g.c.ca;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class d
  extends ca
{
  public static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "rankID";
    locala.sKA.put("rankID", "TEXT");
    localStringBuilder.append(" rankID TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "appusername";
    locala.sKA.put("appusername", "TEXT");
    localStringBuilder.append(" appusername TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "username";
    locala.sKA.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "ranknum";
    locala.sKA.put("ranknum", "INTEGER");
    localStringBuilder.append(" ranknum INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "score";
    locala.sKA.put("score", "INTEGER");
    localStringBuilder.append(" score INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "likecount";
    locala.sKA.put("likecount", "INTEGER default '0' ");
    localStringBuilder.append(" likecount INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "selfLikeState";
    locala.sKA.put("selfLikeState", "INTEGER default '3' ");
    localStringBuilder.append(" selfLikeState INTEGER default '3' ");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final String toString()
  {
    String str = "{" + "username: " + this.field_username + " ranknum: " + this.field_ranknum + " score: " + this.field_score;
    str = str + " likeCount:" + this.field_likecount + " selfLikeState:" + this.field_selfLikeState;
    return str + "}";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/b/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */