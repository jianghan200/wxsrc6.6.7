package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.mm.g.c.cl;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class k
  extends cl
{
  public static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "title";
    locala.sKA.put("title", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" title TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "title";
    locala.columns[1] = "loan_jump_url";
    locala.sKA.put("loan_jump_url", "TEXT");
    localStringBuilder.append(" loan_jump_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "red_dot_index";
    locala.sKA.put("red_dot_index", "INTEGER");
    localStringBuilder.append(" red_dot_index INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "is_show_entry";
    locala.sKA.put("is_show_entry", "INTEGER");
    localStringBuilder.append(" is_show_entry INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "tips";
    locala.sKA.put("tips", "TEXT");
    localStringBuilder.append(" tips TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "is_overdue";
    locala.sKA.put("is_overdue", "INTEGER");
    localStringBuilder.append(" is_overdue INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "available_otb";
    locala.sKA.put("available_otb", "TEXT");
    localStringBuilder.append(" available_otb TEXT");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */