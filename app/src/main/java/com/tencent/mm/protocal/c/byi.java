package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class byi
  extends bhd
{
  public String rMq;
  public bhy rhB;
  public int shg;
  public int shi;
  public byp suq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.suq == null) {
        throw new b("Not all required fields were included: Piece");
      }
      if (this.rhB == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.suq != null)
      {
        paramVarArgs.fV(2, this.suq.boi());
        this.suq.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.shg);
      paramVarArgs.fT(4, this.shi);
      if (this.rMq != null) {
        paramVarArgs.g(5, this.rMq);
      }
      if (this.rhB != null)
      {
        paramVarArgs.fV(6, this.rhB.boi());
        this.rhB.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label768;
      }
    }
    label768:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.suq != null) {
        i = paramInt + f.a.a.a.fS(2, this.suq.boi());
      }
      i = i + f.a.a.a.fQ(3, this.shg) + f.a.a.a.fQ(4, this.shi);
      paramInt = i;
      if (this.rMq != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rMq);
      }
      i = paramInt;
      if (this.rhB != null) {
        i = paramInt + f.a.a.a.fS(6, this.rhB.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.suq == null) {
          throw new b("Not all required fields were included: Piece");
        }
        if (this.rhB != null) {
          break;
        }
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        byi localbyi = (byi)paramVarArgs[1];
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
            localbyi.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byp();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbyi.suq = ((byp)localObject1);
            paramInt += 1;
          }
        case 3: 
          localbyi.shg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbyi.shi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbyi.rMq = ((f.a.a.a.a)localObject1).vHC.readString();
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
          localbyi.rhB = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/byi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */