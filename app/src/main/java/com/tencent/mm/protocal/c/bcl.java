package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bcl
  extends bhp
{
  public int iwS;
  public String iwT;
  public int kpJ;
  public int kpu;
  public String kpv;
  public int rxG;
  public long rxH;
  public int seD;
  public int seF;
  public int seG;
  
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
      paramVarArgs.fT(3, this.rxG);
      paramVarArgs.T(4, this.rxH);
      paramVarArgs.fT(5, this.seF);
      paramVarArgs.fT(6, this.seD);
      paramVarArgs.fT(7, this.kpJ);
      paramVarArgs.fT(8, this.seG);
      paramVarArgs.fT(9, this.iwS);
      if (this.iwT != null) {
        paramVarArgs.g(10, this.iwT);
      }
      paramVarArgs.fT(11, this.kpu);
      if (this.kpv != null) {
        paramVarArgs.g(12, this.kpv);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label735;
      }
    }
    label735:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(3, this.rxG) + f.a.a.a.S(4, this.rxH) + f.a.a.a.fQ(5, this.seF) + f.a.a.a.fQ(6, this.seD) + f.a.a.a.fQ(7, this.kpJ) + f.a.a.a.fQ(8, this.seG) + f.a.a.a.fQ(9, this.iwS);
      paramInt = i;
      if (this.iwT != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.iwT);
      }
      i = paramInt + f.a.a.a.fQ(11, this.kpu);
      paramInt = i;
      if (this.kpv != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.kpv);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
        bcl localbcl = (bcl)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        case 2: 
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbcl.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 3: 
          localbcl.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbcl.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 5: 
          localbcl.seF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbcl.seD = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbcl.kpJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbcl.seG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbcl.iwS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localbcl.iwT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localbcl.kpu = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbcl.kpv = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */