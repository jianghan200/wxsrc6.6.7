package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aka
  extends bhp
{
  public int rHG;
  public LinkedList<ccd> rHH = new LinkedList();
  public String rMA;
  public int rMB;
  public String rMC;
  public String rMD;
  public String rME;
  public String rMy;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rHG);
      paramVarArgs.d(3, 8, this.rHH);
      if (this.rMA != null) {
        paramVarArgs.g(4, this.rMA);
      }
      if (this.rMy != null) {
        paramVarArgs.g(5, this.rMy);
      }
      paramVarArgs.fT(6, this.rMB);
      if (this.rMC != null) {
        paramVarArgs.g(7, this.rMC);
      }
      if (this.rMD != null) {
        paramVarArgs.g(8, this.rMD);
      }
      if (this.rME != null) {
        paramVarArgs.g(9, this.rME);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label799;
      }
    }
    label799:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rHG) + f.a.a.a.c(3, 8, this.rHH);
      paramInt = i;
      if (this.rMA != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rMA);
      }
      i = paramInt;
      if (this.rMy != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rMy);
      }
      i += f.a.a.a.fQ(6, this.rMB);
      paramInt = i;
      if (this.rMC != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rMC);
      }
      i = paramInt;
      if (this.rMD != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.rMD);
      }
      paramInt = i;
      if (this.rME != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rME);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rHH.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        aka localaka = (aka)paramVarArgs[1];
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
            localaka.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaka.rHG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ccd();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ccd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaka.rHH.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localaka.rMA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaka.rMy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaka.rMB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localaka.rMC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localaka.rMD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localaka.rME = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/aka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */