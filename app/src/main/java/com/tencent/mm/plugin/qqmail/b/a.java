package com.tencent.mm.plugin.qqmail.b;

import com.tencent.mm.platformtools.h;
import com.tencent.mm.sdk.platformtools.x;
import f.a.a.b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.bk.a
{
  String mbY;
  private boolean mbZ;
  LinkedList<i> mca = new LinkedList();
  private boolean mcb;
  
  public static String JO(String paramString)
  {
    String str;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      x.d("MicroMsg.getAdjustFullSpell", "%s", new Object[] { "srcName is null or empty, adjust full spell = ~" });
      str = "~";
      return str;
    }
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    for (;;)
    {
      if (i >= arrayOfChar.length) {
        break label184;
      }
      char c = arrayOfChar[i];
      if ((c >= '0') && (c <= '9')) {
        return String.format("{%c%s", new Object[] { Character.valueOf(c), paramString });
      }
      if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')))
      {
        str = paramString;
        if (i == 0) {
          break;
        }
        return String.format("%c%s", new Object[] { Character.valueOf(c), paramString });
      }
      if ((c == '{') && (i == 0) && (arrayOfChar.length > 1) && (arrayOfChar[(i + 1)] >= '0'))
      {
        str = paramString;
        if (arrayOfChar[(i + 1)] <= '9') {
          break;
        }
      }
      i += 1;
    }
    label184:
    x.d("MicroMsg.getAdjustFullSpell", "%s is not ok, return '~'", new Object[] { paramString });
    return "~";
  }
  
  private static boolean a(i parami1, i parami2)
  {
    boolean bool = true;
    if ((parami1 == null) || (parami2 == null)) {
      bool = false;
    }
    int i;
    do
    {
      do
      {
        return bool;
        i = b(parami1).compareTo(b(parami2));
        if (i != 0) {
          break;
        }
      } while (parami1.kCs.compareTo(parami2.kCs) <= 0);
      return false;
    } while (i < 0);
    return false;
  }
  
  public static String b(i parami)
  {
    String str = parami.mcD;
    if ((str == null) || ("".equals(str))) {}
    for (str = JO(h.oI(parami.name.trim()).toLowerCase());; str = JO(str))
    {
      parami.mcD = str;
      return str;
    }
  }
  
  private a boh()
  {
    if (!this.mbZ) {
      throw new b("Not all required fields were included (false = not included in message),  syncInfo:" + this.mbZ);
    }
    return this;
  }
  
  public final a JN(String paramString)
  {
    this.mbY = paramString;
    this.mbZ = true;
    return this;
  }
  
  public final a a(i parami)
  {
    int j = 0;
    if (!this.mcb) {
      this.mcb = true;
    }
    Iterator localIterator = this.mca.iterator();
    int i = 0;
    i locali;
    if (localIterator.hasNext())
    {
      locali = (i)localIterator.next();
      if (i < 10) {
        if (parami.mcC <= locali.mcC) {
          break label96;
        }
      }
    }
    else
    {
      label65:
      if (i < this.mca.size()) {
        break label103;
      }
      this.mca.add(parami);
    }
    label96:
    label103:
    do
    {
      return this;
      if (a(parami, locali)) {
        break label65;
      }
      i += 1;
      break;
      this.mca.add(i, parami);
    } while ((i >= 10) || (this.mca.size() <= 10));
    parami = (i)this.mca.remove(10);
    localIterator = this.mca.iterator();
    i = j;
    while (localIterator.hasNext())
    {
      locali = (i)localIterator.next();
      if ((i >= 10) && (a(parami, locali))) {
        break;
      }
      i += 1;
    }
    if (i >= this.mca.size())
    {
      this.mca.add(parami);
      return this;
    }
    this.mca.add(i, parami);
    return this;
  }
  
  public final void a(f.a.a.c.a parama)
  {
    parama.g(1, this.mbY);
    parama.d(2, 8, this.mca);
  }
  
  public final a aF(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new f.a.a.a.a(paramArrayOfByte, unknownTagHandler);
    int i = a(paramArrayOfByte);
    if (i > 0)
    {
      switch (i)
      {
      default: 
        i = 0;
      }
      for (;;)
      {
        if (i == 0) {
          paramArrayOfByte.cJS();
        }
        i = a(paramArrayOfByte);
        break;
        JN(paramArrayOfByte.vHC.readString());
        i = 1;
        continue;
        Object localObject1 = paramArrayOfByte.IC(2);
        i = 0;
        i locali;
        while (i < ((LinkedList)localObject1).size())
        {
          Object localObject2 = (byte[])((LinkedList)localObject1).get(i);
          locali = new i();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = locali.a((f.a.a.a.a)localObject2, locali, a((f.a.a.a.a)localObject2))) {}
          if (!this.mcb) {
            this.mcb = true;
          }
          this.mca.add(locali);
          i += 1;
        }
        localObject1 = new i[1];
        localObject1 = (i[])this.mca.toArray((Object[])localObject1);
        Arrays.sort((Object[])localObject1, new a.1(this));
        if (10 <= localObject1.length) {
          Arrays.sort((Object[])localObject1, 10, localObject1.length, new a.2(this));
        }
        this.mca.clear();
        int j = localObject1.length;
        i = 0;
        while (i < j)
        {
          locali = localObject1[i];
          this.mca.add(locali);
          i += 1;
        }
        i = 1;
      }
    }
    return boh();
  }
  
  public final int boi()
  {
    return f.a.a.b.b.a.h(1, this.mbY) + 0 + (f.a.a.a.c(2, 8, this.mca) + 0);
  }
  
  public final byte[] toByteArray()
  {
    boh();
    return super.toByteArray();
  }
  
  public final String toString()
  {
    String str = "" + getClass().getName() + "(";
    str = str + "syncInfo = " + this.mbY + "   ";
    str = str + "addrs = " + this.mca + "   ";
    return str + ")";
  }
  
  public final a uT(int paramInt)
  {
    boolean bool = false;
    if ((paramInt < 0) || (paramInt >= this.mca.size())) {
      return this;
    }
    if (paramInt >= 10)
    {
      this.mca.remove(paramInt);
      if (this.mca.size() > 0) {
        bool = true;
      }
      this.mcb = bool;
      return this;
    }
    this.mca.remove(paramInt);
    Iterator localIterator = this.mca.iterator();
    int i = -1;
    int k = Integer.MIN_VALUE;
    int j = 0;
    for (;;)
    {
      label83:
      if (localIterator.hasNext())
      {
        i locali = (i)localIterator.next();
        paramInt = j + 1;
        if (j < 10) {
          break label217;
        }
        if (k >= locali.mcC) {
          break label214;
        }
        k = locali.mcC;
        i = paramInt;
      }
      label214:
      for (;;)
      {
        j = paramInt;
        break label83;
        if ((i == -1) || (i >= this.mca.size())) {
          break;
        }
        try
        {
          a((i)this.mca.remove(i));
        }
        catch (Exception localException)
        {
          x.printErrStackTrace("MicroMsg.AddrBook", localException, "size:%d, idx:%d", new Object[] { Integer.valueOf(this.mca.size()), Integer.valueOf(i) });
        }
        break;
      }
      label217:
      j = paramInt;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */