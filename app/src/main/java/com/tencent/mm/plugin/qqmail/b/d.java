package com.tencent.mm.plugin.qqmail.b;

import f.a.a.b;
import java.util.LinkedList;

public final class d
  extends com.tencent.mm.bk.a
{
  public String content;
  public int mce;
  public String mcf;
  public LinkedList<i> mcg = new LinkedList();
  public LinkedList<i> mch = new LinkedList();
  public LinkedList<i> mci = new LinkedList();
  public LinkedList<y> mcj = new LinkedList();
  public String mck;
  public int mcl = 5;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.content == null) {
        throw new b("Not all required fields were included: content");
      }
      paramVarArgs.fT(1, this.mce);
      if (this.mcf != null) {
        paramVarArgs.g(2, this.mcf);
      }
      paramVarArgs.d(3, 8, this.mcg);
      paramVarArgs.d(4, 8, this.mch);
      paramVarArgs.d(5, 8, this.mci);
      paramVarArgs.d(6, 8, this.mcj);
      if (this.mck != null) {
        paramVarArgs.g(7, this.mck);
      }
      if (this.content != null) {
        paramVarArgs.g(8, this.content);
      }
      paramVarArgs.fT(9, this.mcl);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.mce) + 0;
      paramInt = i;
      if (this.mcf != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.mcf);
      }
      i = paramInt + f.a.a.a.c(3, 8, this.mcg) + f.a.a.a.c(4, 8, this.mch) + f.a.a.a.c(5, 8, this.mci) + f.a.a.a.c(6, 8, this.mcj);
      paramInt = i;
      if (this.mck != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.mck);
      }
      i = paramInt;
      if (this.content != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.content);
      }
      return i + f.a.a.a.fQ(9, this.mcl);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mcg.clear();
      this.mch.clear();
      this.mci.clear();
      this.mcj.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.content == null) {
        throw new b("Not all required fields were included: content");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        locald.mce = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        locald.mcf = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new i();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((i)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          locald.mcg.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new i();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((i)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          locald.mch.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new i();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((i)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          locald.mci.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new y();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((y)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          locald.mcj.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 7: 
        locald.mck = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 8: 
        locald.content = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      locald.mcl = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */