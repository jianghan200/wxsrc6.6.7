package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class amo
  extends com.tencent.mm.bk.a
{
  public int create_time;
  public int huK;
  public String hwg;
  public int peW;
  public String rIw;
  public String rPn;
  public bao rPo;
  public int rPp;
  public int rPq;
  public String rPr;
  public String rrW;
  public long ruW;
  public int state;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rIw != null) {
        paramVarArgs.g(1, this.rIw);
      }
      if (this.rrW != null) {
        paramVarArgs.g(2, this.rrW);
      }
      paramVarArgs.T(3, this.ruW);
      paramVarArgs.fT(4, this.state);
      if (this.rPn != null) {
        paramVarArgs.g(5, this.rPn);
      }
      paramVarArgs.fT(6, this.peW);
      if (this.rPo != null)
      {
        paramVarArgs.fV(7, this.rPo.boi());
        this.rPo.a(paramVarArgs);
      }
      paramVarArgs.fT(8, this.create_time);
      paramVarArgs.fT(9, this.huK);
      paramVarArgs.fT(10, this.rPp);
      paramVarArgs.fT(11, this.rPq);
      if (this.rPr != null) {
        paramVarArgs.g(12, this.rPr);
      }
      if (this.hwg != null) {
        paramVarArgs.g(13, this.hwg);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rIw == null) {
        break label829;
      }
    }
    label829:
    for (paramInt = f.a.a.b.b.a.h(1, this.rIw) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rrW != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rrW);
      }
      i = i + f.a.a.a.S(3, this.ruW) + f.a.a.a.fQ(4, this.state);
      paramInt = i;
      if (this.rPn != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rPn);
      }
      i = paramInt + f.a.a.a.fQ(6, this.peW);
      paramInt = i;
      if (this.rPo != null) {
        paramInt = i + f.a.a.a.fS(7, this.rPo.boi());
      }
      i = paramInt + f.a.a.a.fQ(8, this.create_time) + f.a.a.a.fQ(9, this.huK) + f.a.a.a.fQ(10, this.rPp) + f.a.a.a.fQ(11, this.rPq);
      paramInt = i;
      if (this.rPr != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.rPr);
      }
      i = paramInt;
      if (this.hwg != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.hwg);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        amo localamo = (amo)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localamo.rIw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localamo.rrW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localamo.ruW = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localamo.state = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localamo.rPn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localamo.peW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bao();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bao)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localamo.rPo = ((bao)localObject1);
            paramInt += 1;
          }
        case 8: 
          localamo.create_time = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localamo.huK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localamo.rPp = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localamo.rPq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localamo.rPr = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localamo.hwg = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/amo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */