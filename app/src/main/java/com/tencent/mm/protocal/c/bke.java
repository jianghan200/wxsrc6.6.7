package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bke
  extends bhd
{
  public String eJK;
  public int rdY;
  public int rmA;
  public int rwB;
  public String rwk;
  public df sjS;
  public String sjT;
  public String sjU;
  public int sjV;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sjS == null) {
        throw new b("Not all required fields were included: Msg");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.sjS != null)
      {
        paramVarArgs.fV(2, this.sjS.boi());
        this.sjS.a(paramVarArgs);
      }
      if (this.sjT != null) {
        paramVarArgs.g(3, this.sjT);
      }
      paramVarArgs.fT(4, this.rwB);
      if (this.rwk != null) {
        paramVarArgs.g(5, this.rwk);
      }
      paramVarArgs.fT(6, this.rdY);
      if (this.eJK != null) {
        paramVarArgs.g(7, this.eJK);
      }
      if (this.sjU != null) {
        paramVarArgs.g(8, this.sjU);
      }
      paramVarArgs.fT(9, this.sjV);
      paramVarArgs.fT(10, this.rmA);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label834;
      }
    }
    label834:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sjS != null) {
        paramInt = i + f.a.a.a.fS(2, this.sjS.boi());
      }
      i = paramInt;
      if (this.sjT != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sjT);
      }
      i += f.a.a.a.fQ(4, this.rwB);
      paramInt = i;
      if (this.rwk != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rwk);
      }
      i = paramInt + f.a.a.a.fQ(6, this.rdY);
      paramInt = i;
      if (this.eJK != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.eJK);
      }
      i = paramInt;
      if (this.sjU != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.sjU);
      }
      return i + f.a.a.a.fQ(9, this.sjV) + f.a.a.a.fQ(10, this.rmA);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.sjS != null) {
          break;
        }
        throw new b("Not all required fields were included: Msg");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bke localbke = (bke)paramVarArgs[1];
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
            localbke.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new df();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((df)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbke.sjS = ((df)localObject1);
            paramInt += 1;
          }
        case 3: 
          localbke.sjT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbke.rwB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbke.rwk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbke.rdY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbke.eJK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbke.sjU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localbke.sjV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbke.rmA = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */