package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aqu
  extends bhp
{
  public int noH;
  public int rHb;
  public LinkedList<aqp> rHc = new LinkedList();
  public int rTs;
  public int rTt;
  public int rTu;
  
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
      paramVarArgs.fT(2, this.rHb);
      paramVarArgs.d(3, 8, this.rHc);
      paramVarArgs.fT(4, this.noH);
      paramVarArgs.fT(5, this.rTs);
      paramVarArgs.fT(6, this.rTt);
      paramVarArgs.fT(7, this.rTu);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label625;
      }
    }
    label625:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.rHb) + f.a.a.a.c(3, 8, this.rHc) + f.a.a.a.fQ(4, this.noH) + f.a.a.a.fQ(5, this.rTs) + f.a.a.a.fQ(6, this.rTt) + f.a.a.a.fQ(7, this.rTu);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rHc.clear();
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
        aqu localaqu = (aqu)paramVarArgs[1];
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
            localaqu.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaqu.rHb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aqp();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aqp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaqu.rHc.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localaqu.noH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localaqu.rTs = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localaqu.rTt = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localaqu.rTu = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/aqu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */