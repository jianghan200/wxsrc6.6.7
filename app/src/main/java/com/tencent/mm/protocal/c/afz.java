package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class afz
  extends bhp
{
  public int hbF;
  public LinkedList<ayv> hbG = new LinkedList();
  public int hcE;
  public int rJL;
  public int rlm;
  
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
      paramVarArgs.fT(2, this.hbF);
      paramVarArgs.d(3, 8, this.hbG);
      paramVarArgs.fT(4, this.rlm);
      paramVarArgs.fT(5, this.rJL);
      paramVarArgs.fT(6, this.hcE);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label586;
      }
    }
    label586:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.hbF) + f.a.a.a.c(3, 8, this.hbG) + f.a.a.a.fQ(4, this.rlm) + f.a.a.a.fQ(5, this.rJL) + f.a.a.a.fQ(6, this.hcE);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.hbG.clear();
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
        afz localafz = (afz)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        int i;
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
            localafz.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localafz.hbF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ayv();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ayv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localafz.hbG.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localafz.rlm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localafz.rJL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localafz.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/afz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */