package com.tencent.mm.plugin.game.d;

import java.util.LinkedList;

public final class av
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOT;
  public e jOV;
  public String jPG;
  public String jQb;
  public LinkedList<String> jRf = new LinkedList();
  public String jRg;
  public String jRh;
  public String jRi;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.jPG != null) {
        paramVarArgs.g(2, this.jPG);
      }
      paramVarArgs.d(3, 1, this.jRf);
      if (this.jRg != null) {
        paramVarArgs.g(4, this.jRg);
      }
      if (this.jOT != null) {
        paramVarArgs.g(5, this.jOT);
      }
      if (this.jRh != null) {
        paramVarArgs.g(6, this.jRh);
      }
      if (this.jRi != null) {
        paramVarArgs.g(8, this.jRi);
      }
      if (this.jQb != null) {
        paramVarArgs.g(9, this.jQb);
      }
      if (this.jOV != null)
      {
        paramVarArgs.fV(10, this.jOV.boi());
        this.jOV.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label721;
      }
    }
    label721:
    for (paramInt = f.a.a.b.b.a.h(1, this.bHD) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jPG != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jPG);
      }
      i += f.a.a.a.c(3, 1, this.jRf);
      paramInt = i;
      if (this.jRg != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jRg);
      }
      i = paramInt;
      if (this.jOT != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jOT);
      }
      paramInt = i;
      if (this.jRh != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.jRh);
      }
      i = paramInt;
      if (this.jRi != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.jRi);
      }
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.jQb);
      }
      i = paramInt;
      if (this.jOV != null) {
        i = paramInt + f.a.a.a.fS(10, this.jOV.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jRf.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        av localav = (av)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        case 7: 
        default: 
          return -1;
        case 1: 
          localav.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localav.jPG = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localav.jRf.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 4: 
          localav.jRg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localav.jOT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localav.jRh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localav.jRi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localav.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((e)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localav.jOV = ((e)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/d/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */