package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class caa
  extends bhp
{
  public int hLg;
  public int lOH;
  public int rxG;
  public long rxH;
  public int svK;
  public String svS;
  public LinkedList<cav> svT = new LinkedList();
  
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
      paramVarArgs.fT(2, this.rxG);
      paramVarArgs.T(3, this.rxH);
      paramVarArgs.fT(4, this.lOH);
      paramVarArgs.fT(6, this.hLg);
      paramVarArgs.d(7, 8, this.svT);
      if (this.svS != null) {
        paramVarArgs.g(8, this.svS);
      }
      paramVarArgs.fT(9, this.svK);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label692;
      }
    }
    label692:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rxG) + f.a.a.a.S(3, this.rxH) + f.a.a.a.fQ(4, this.lOH) + f.a.a.a.fQ(6, this.hLg) + f.a.a.a.c(7, 8, this.svT);
      paramInt = i;
      if (this.svS != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.svS);
      }
      return paramInt + f.a.a.a.fQ(9, this.svK);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.svT.clear();
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
        caa localcaa = (caa)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 5: 
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
            localcaa.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcaa.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localcaa.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localcaa.lOH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localcaa.hLg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cav();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cav)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localcaa.svT.add(localObject1);
            paramInt += 1;
          }
        case 8: 
          localcaa.svS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localcaa.svK = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/caa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */