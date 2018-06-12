package com.tencent.mm.protocal.c;

import d.a.a.g;
import java.util.LinkedList;

public final class ul
  extends bhp
{
  public int hwV;
  public String hwW;
  public LinkedList<g> rxS = new LinkedList();
  public int rxT;
  public d.a.a.a rxU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.hwV);
      if (this.hwW != null) {
        paramVarArgs.g(3, this.hwW);
      }
      paramVarArgs.d(4, 8, this.rxS);
      paramVarArgs.fT(5, this.rxT);
      if (this.rxU != null)
      {
        paramVarArgs.fV(6, this.rxU.boi());
        this.rxU.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label684;
      }
    }
    label684:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwV);
      paramInt = i;
      if (this.hwW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hwW);
      }
      i = paramInt + f.a.a.a.c(4, 8, this.rxS) + f.a.a.a.fQ(5, this.rxT);
      paramInt = i;
      if (this.rxU != null) {
        paramInt = i + f.a.a.a.fS(6, this.rxU.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rxS.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ul localul = (ul)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localul.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localul.hwV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localul.hwW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new g();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((g)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localul.rxS.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          localul.rxT = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new d.a.a.a();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((d.a.a.a)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localul.rxU = ((d.a.a.a)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/ul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */