package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bcs
  extends bhd
{
  public long appid;
  public int bIH;
  public long riY;
  public int scene;
  public String scj;
  public int seR;
  public long seS;
  public int seT;
  public long seU;
  public long seV;
  public int seW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.seR);
      paramVarArgs.T(3, this.seS);
      paramVarArgs.T(4, this.appid);
      paramVarArgs.T(5, this.riY);
      paramVarArgs.fT(6, this.seT);
      paramVarArgs.fT(7, this.scene);
      paramVarArgs.fT(8, this.bIH);
      paramVarArgs.T(9, this.seU);
      paramVarArgs.T(10, this.seV);
      paramVarArgs.fT(11, this.seW);
      if (this.scj != null) {
        paramVarArgs.g(12, this.scj);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label714;
      }
    }
    label714:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.seR) + f.a.a.a.S(3, this.seS) + f.a.a.a.S(4, this.appid) + f.a.a.a.S(5, this.riY) + f.a.a.a.fQ(6, this.seT) + f.a.a.a.fQ(7, this.scene) + f.a.a.a.fQ(8, this.bIH) + f.a.a.a.S(9, this.seU) + f.a.a.a.S(10, this.seV) + f.a.a.a.fQ(11, this.seW);
      paramInt = i;
      if (this.scj != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.scj);
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
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bcs localbcs = (bcs)paramVarArgs[1];
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
            localbcs.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbcs.seR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbcs.seS = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localbcs.appid = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 5: 
          localbcs.riY = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 6: 
          localbcs.seT = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbcs.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbcs.bIH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbcs.seU = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 10: 
          localbcs.seV = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 11: 
          localbcs.seW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbcs.scj = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/bcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */