package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aj
  extends bhd
{
  public String cac;
  public String cad;
  public int cae;
  public String hwf;
  public String qZN;
  public String qZO;
  public int qZP;
  public int qZQ;
  public bqs qZR;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.cac == null) {
        throw new b("Not all required fields were included: card_id");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.hwf != null) {
        paramVarArgs.g(2, this.hwf);
      }
      paramVarArgs.fT(3, this.cae);
      if (this.cac != null) {
        paramVarArgs.g(4, this.cac);
      }
      if (this.cad != null) {
        paramVarArgs.g(5, this.cad);
      }
      if (this.qZN != null) {
        paramVarArgs.g(6, this.qZN);
      }
      if (this.qZO != null) {
        paramVarArgs.g(7, this.qZO);
      }
      paramVarArgs.fT(8, this.qZP);
      paramVarArgs.fT(9, this.qZQ);
      if (this.qZR != null)
      {
        paramVarArgs.fV(10, this.qZR.boi());
        this.qZR.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label854;
      }
    }
    label854:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hwf != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hwf);
      }
      i += f.a.a.a.fQ(3, this.cae);
      paramInt = i;
      if (this.cac != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.cac);
      }
      i = paramInt;
      if (this.cad != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.cad);
      }
      paramInt = i;
      if (this.qZN != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.qZN);
      }
      i = paramInt;
      if (this.qZO != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.qZO);
      }
      i = i + f.a.a.a.fQ(8, this.qZP) + f.a.a.a.fQ(9, this.qZQ);
      paramInt = i;
      if (this.qZR != null) {
        paramInt = i + f.a.a.a.fS(10, this.qZR.boi());
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
        if (this.cac != null) {
          break;
        }
        throw new b("Not all required fields were included: card_id");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        aj localaj = (aj)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaj.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaj.hwf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaj.cae = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localaj.cac = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaj.cad = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaj.qZN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localaj.qZO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localaj.qZP = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localaj.qZQ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqs();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localaj.qZR = ((bqs)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */