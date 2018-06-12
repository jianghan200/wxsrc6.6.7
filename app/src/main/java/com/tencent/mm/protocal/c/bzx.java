package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bzx
  extends bhd
{
  public bhy rfy;
  public int rxG;
  public long rxH;
  public int seq;
  public int svM;
  public int svN;
  public int svO;
  public int svP;
  public int svQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rfy == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rxG);
      paramVarArgs.T(3, this.rxH);
      paramVarArgs.fT(4, this.seq);
      paramVarArgs.fT(5, this.svM);
      paramVarArgs.fT(6, this.svN);
      paramVarArgs.fT(7, this.svO);
      paramVarArgs.fT(8, this.svP);
      paramVarArgs.fT(9, this.svQ);
      if (this.rfy != null)
      {
        paramVarArgs.fV(10, this.rfy.boi());
        this.rfy.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label762;
      }
    }
    label762:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rxG) + f.a.a.a.S(3, this.rxH) + f.a.a.a.fQ(4, this.seq) + f.a.a.a.fQ(5, this.svM) + f.a.a.a.fQ(6, this.svN) + f.a.a.a.fQ(7, this.svO) + f.a.a.a.fQ(8, this.svP) + f.a.a.a.fQ(9, this.svQ);
      paramInt = i;
      if (this.rfy != null) {
        paramInt = i + f.a.a.a.fS(10, this.rfy.boi());
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
        if (this.rfy != null) {
          break;
        }
        throw new b("Not all required fields were included: Buffer");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bzx localbzx = (bzx)paramVarArgs[1];
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
            localbzx.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbzx.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbzx.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localbzx.seq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbzx.svM = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbzx.svN = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbzx.svO = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbzx.svP = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbzx.svQ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localbzx.rfy = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */