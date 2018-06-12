package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aat
  extends bhd
{
  public String hFm;
  public String pnl;
  public String rFZ;
  public String rGa;
  public String rki;
  public String ruF;
  public String signature;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ruF == null) {
        throw new b("Not all required fields were included: corp_id");
      }
      if (this.rFZ == null) {
        throw new b("Not all required fields were included: group_id");
      }
      if (this.pnl == null) {
        throw new b("Not all required fields were included: time_stamp");
      }
      if (this.hFm == null) {
        throw new b("Not all required fields were included: nonce_str");
      }
      if (this.signature == null) {
        throw new b("Not all required fields were included: signature");
      }
      if (this.rki == null) {
        throw new b("Not all required fields were included: from_url");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.ruF != null) {
        paramVarArgs.g(2, this.ruF);
      }
      if (this.rFZ != null) {
        paramVarArgs.g(3, this.rFZ);
      }
      if (this.pnl != null) {
        paramVarArgs.g(4, this.pnl);
      }
      if (this.hFm != null) {
        paramVarArgs.g(5, this.hFm);
      }
      if (this.signature != null) {
        paramVarArgs.g(6, this.signature);
      }
      if (this.rki != null) {
        paramVarArgs.g(7, this.rki);
      }
      if (this.rGa != null) {
        paramVarArgs.g(8, this.rGa);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label866;
      }
    }
    label866:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ruF != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.ruF);
      }
      i = paramInt;
      if (this.rFZ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rFZ);
      }
      paramInt = i;
      if (this.pnl != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.pnl);
      }
      i = paramInt;
      if (this.hFm != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hFm);
      }
      paramInt = i;
      if (this.signature != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.signature);
      }
      i = paramInt;
      if (this.rki != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rki);
      }
      paramInt = i;
      if (this.rGa != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rGa);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.ruF == null) {
          throw new b("Not all required fields were included: corp_id");
        }
        if (this.rFZ == null) {
          throw new b("Not all required fields were included: group_id");
        }
        if (this.pnl == null) {
          throw new b("Not all required fields were included: time_stamp");
        }
        if (this.hFm == null) {
          throw new b("Not all required fields were included: nonce_str");
        }
        if (this.signature == null) {
          throw new b("Not all required fields were included: signature");
        }
        if (this.rki != null) {
          break;
        }
        throw new b("Not all required fields were included: from_url");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        aat localaat = (aat)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaat.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaat.ruF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaat.rFZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaat.pnl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaat.hFm = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaat.signature = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localaat.rki = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localaat.rGa = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/aat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */