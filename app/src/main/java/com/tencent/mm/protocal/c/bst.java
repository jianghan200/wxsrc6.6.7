package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bst
  extends bhp
{
  public int rGc;
  public int rGd;
  public int rdV;
  public int rdW;
  public int sdg;
  public int spX;
  public LinkedList<bhz> spY = new LinkedList();
  
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
      paramVarArgs.fT(2, this.rdW);
      paramVarArgs.fT(3, this.rdV);
      paramVarArgs.fT(4, this.rGc);
      paramVarArgs.fT(5, this.rGd);
      paramVarArgs.fT(6, this.spX);
      paramVarArgs.d(7, 8, this.spY);
      paramVarArgs.fT(8, this.sdg);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label664;
      }
    }
    label664:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.rdW) + f.a.a.a.fQ(3, this.rdV) + f.a.a.a.fQ(4, this.rGc) + f.a.a.a.fQ(5, this.rGd) + f.a.a.a.fQ(6, this.spX) + f.a.a.a.c(7, 8, this.spY) + f.a.a.a.fQ(8, this.sdg);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.spY.clear();
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
        bst localbst = (bst)paramVarArgs[1];
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
            localbst.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbst.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbst.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbst.rGc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbst.rGd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbst.spX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbst.spY.add(localObject1);
            paramInt += 1;
          }
        }
        localbst.sdg = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bst.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */