package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class lo
  extends bhd
{
  public int amount;
  public String hyG;
  public String mxM;
  public String mxX;
  public String mxY;
  public String myl;
  public String myo;
  public String nickname;
  public String rpI;
  
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
      paramVarArgs.fT(2, this.amount);
      if (this.hyG != null) {
        paramVarArgs.g(3, this.hyG);
      }
      if (this.myl != null) {
        paramVarArgs.g(4, this.myl);
      }
      if (this.rpI != null) {
        paramVarArgs.g(5, this.rpI);
      }
      if (this.mxX != null) {
        paramVarArgs.g(6, this.mxX);
      }
      if (this.mxY != null) {
        paramVarArgs.g(7, this.mxY);
      }
      if (this.myo != null) {
        paramVarArgs.g(8, this.myo);
      }
      if (this.nickname != null) {
        paramVarArgs.g(9, this.nickname);
      }
      if (this.mxM != null) {
        paramVarArgs.g(10, this.mxM);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label760;
      }
    }
    label760:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.amount);
      paramInt = i;
      if (this.hyG != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hyG);
      }
      i = paramInt;
      if (this.myl != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.myl);
      }
      paramInt = i;
      if (this.rpI != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rpI);
      }
      i = paramInt;
      if (this.mxX != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.mxX);
      }
      paramInt = i;
      if (this.mxY != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.mxY);
      }
      i = paramInt;
      if (this.myo != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.myo);
      }
      paramInt = i;
      if (this.nickname != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.nickname);
      }
      i = paramInt;
      if (this.mxM != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.mxM);
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
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        lo locallo = (lo)paramVarArgs[1];
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
            locallo.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          locallo.amount = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          locallo.hyG = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          locallo.myl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          locallo.rpI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          locallo.mxX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          locallo.mxY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          locallo.myo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          locallo.nickname = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        locallo.mxM = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/lo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */