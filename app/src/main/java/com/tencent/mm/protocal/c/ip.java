package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ip
  extends bhd
{
  public int count;
  public int lKQ;
  public int mEk;
  public String mFy;
  public String mFz;
  public String rjL;
  public String rjM;
  public String rjN;
  public String rjO;
  public String rjP;
  public String rjQ;
  public int type;
  public String value;
  
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
      if (this.rjL != null) {
        paramVarArgs.g(2, this.rjL);
      }
      if (this.rjM != null) {
        paramVarArgs.g(3, this.rjM);
      }
      if (this.rjN != null) {
        paramVarArgs.g(4, this.rjN);
      }
      if (this.rjO != null) {
        paramVarArgs.g(5, this.rjO);
      }
      if (this.rjP != null) {
        paramVarArgs.g(6, this.rjP);
      }
      paramVarArgs.fT(7, this.mEk);
      if (this.rjQ != null) {
        paramVarArgs.g(8, this.rjQ);
      }
      if (this.mFz != null) {
        paramVarArgs.g(9, this.mFz);
      }
      if (this.mFy != null) {
        paramVarArgs.g(10, this.mFy);
      }
      paramVarArgs.fT(11, this.type);
      if (this.value != null) {
        paramVarArgs.g(12, this.value);
      }
      paramVarArgs.fT(13, this.count);
      paramVarArgs.fT(14, this.lKQ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label936;
      }
    }
    label936:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rjL != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rjL);
      }
      i = paramInt;
      if (this.rjM != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rjM);
      }
      paramInt = i;
      if (this.rjN != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rjN);
      }
      i = paramInt;
      if (this.rjO != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rjO);
      }
      paramInt = i;
      if (this.rjP != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rjP);
      }
      i = paramInt + f.a.a.a.fQ(7, this.mEk);
      paramInt = i;
      if (this.rjQ != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rjQ);
      }
      i = paramInt;
      if (this.mFz != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.mFz);
      }
      paramInt = i;
      if (this.mFy != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.mFy);
      }
      i = paramInt + f.a.a.a.fQ(11, this.type);
      paramInt = i;
      if (this.value != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.value);
      }
      return paramInt + f.a.a.a.fQ(13, this.count) + f.a.a.a.fQ(14, this.lKQ);
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
        ip localip = (ip)paramVarArgs[1];
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
            localip.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localip.rjL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localip.rjM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localip.rjN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localip.rjO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localip.rjP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localip.mEk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localip.rjQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localip.mFz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localip.mFy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localip.type = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localip.value = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localip.count = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localip.lKQ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/ip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */