package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ad
  extends bhp
{
  public int qZA;
  public int qZk;
  public String qZl;
  public bnr qZm;
  public bfw qZn;
  public int qZu;
  public pv qZy;
  public boolean qZz;
  
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
      paramVarArgs.fT(2, this.qZk);
      if (this.qZl != null) {
        paramVarArgs.g(3, this.qZl);
      }
      if (this.qZm != null)
      {
        paramVarArgs.fV(4, this.qZm.boi());
        this.qZm.a(paramVarArgs);
      }
      if (this.qZn != null)
      {
        paramVarArgs.fV(5, this.qZn.boi());
        this.qZn.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.qZu);
      if (this.qZy != null)
      {
        paramVarArgs.fV(7, this.qZy.boi());
        this.qZy.a(paramVarArgs);
      }
      paramVarArgs.av(8, this.qZz);
      paramVarArgs.fT(9, this.qZA);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label956;
      }
    }
    label956:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.qZk);
      paramInt = i;
      if (this.qZl != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.qZl);
      }
      i = paramInt;
      if (this.qZm != null) {
        i = paramInt + f.a.a.a.fS(4, this.qZm.boi());
      }
      paramInt = i;
      if (this.qZn != null) {
        paramInt = i + f.a.a.a.fS(5, this.qZn.boi());
      }
      i = paramInt + f.a.a.a.fQ(6, this.qZu);
      paramInt = i;
      if (this.qZy != null) {
        paramInt = i + f.a.a.a.fS(7, this.qZy.boi());
      }
      return paramInt + (f.a.a.b.b.a.ec(8) + 1) + f.a.a.a.fQ(9, this.qZA);
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
        ad localad = (ad)paramVarArgs[1];
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
            localad.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localad.qZk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localad.qZl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bnr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bnr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localad.qZm = ((bnr)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bfw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bfw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localad.qZn = ((bfw)localObject1);
            paramInt += 1;
          }
        case 6: 
          localad.qZu = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new pv();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((pv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localad.qZy = ((pv)localObject1);
            paramInt += 1;
          }
        case 8: 
          localad.qZz = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        }
        localad.qZA = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */