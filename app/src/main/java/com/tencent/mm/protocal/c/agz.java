package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class agz
  extends bhp
{
  public int rKl;
  public bhy rKm;
  public String rKn;
  public String rKo;
  public String rKp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rKm == null) {
        throw new b("Not all required fields were included: QRCode");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rKm != null)
      {
        paramVarArgs.fV(2, this.rKm.boi());
        this.rKm.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.rKl);
      if (this.rKn != null) {
        paramVarArgs.g(6, this.rKn);
      }
      if (this.rKo != null) {
        paramVarArgs.g(7, this.rKo);
      }
      if (this.rKp != null) {
        paramVarArgs.g(8, this.rKp);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label706;
      }
    }
    label706:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rKm != null) {
        i = paramInt + f.a.a.a.fS(2, this.rKm.boi());
      }
      i += f.a.a.a.fQ(5, this.rKl);
      paramInt = i;
      if (this.rKn != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rKn);
      }
      i = paramInt;
      if (this.rKo != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rKo);
      }
      paramInt = i;
      if (this.rKp != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rKp);
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
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rKm != null) {
          break;
        }
        throw new b("Not all required fields were included: QRCode");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        agz localagz = (agz)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 3: 
        case 4: 
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
            localagz.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localagz.rKm = ((bhy)localObject1);
            paramInt += 1;
          }
        case 5: 
          localagz.rKl = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localagz.rKn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localagz.rKo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localagz.rKp = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/agz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */