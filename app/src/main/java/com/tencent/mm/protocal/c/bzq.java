package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bzq
  extends bhp
{
  public long rxH;
  public int svC;
  public int svD;
  public int svE;
  public int svF;
  public com.tencent.mm.bk.b svG;
  public long svs;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.T(2, this.svs);
      paramVarArgs.T(3, this.rxH);
      paramVarArgs.fT(4, this.svC);
      paramVarArgs.fT(5, this.svD);
      paramVarArgs.fT(6, this.svE);
      paramVarArgs.fT(7, this.svF);
      if (this.svG != null) {
        paramVarArgs.b(8, this.svG);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label587;
      }
    }
    label587:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.svs) + f.a.a.a.S(3, this.rxH) + f.a.a.a.fQ(4, this.svC) + f.a.a.a.fQ(5, this.svD) + f.a.a.a.fQ(6, this.svE) + f.a.a.a.fQ(7, this.svF);
      paramInt = i;
      if (this.svG != null) {
        paramInt = i + f.a.a.a.a(8, this.svG);
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
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bzq localbzq = (bzq)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
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
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbzq.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbzq.svs = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 3: 
          localbzq.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localbzq.svC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbzq.svD = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbzq.svE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbzq.svF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbzq.svG = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */