package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class zr
  extends bhd
{
  public String appId;
  public String bJT;
  public String jkW;
  public String jkX;
  public String jkY;
  public String qZf;
  public int qZg;
  public cr rFz;
  public String sign;
  
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
      if (this.appId != null) {
        paramVarArgs.g(2, this.appId);
      }
      if (this.jkW != null) {
        paramVarArgs.g(3, this.jkW);
      }
      if (this.jkX != null) {
        paramVarArgs.g(4, this.jkX);
      }
      if (this.jkY != null) {
        paramVarArgs.g(5, this.jkY);
      }
      if (this.bJT != null) {
        paramVarArgs.g(6, this.bJT);
      }
      if (this.sign != null) {
        paramVarArgs.g(7, this.sign);
      }
      if (this.rFz != null)
      {
        paramVarArgs.fV(8, this.rFz.boi());
        this.rFz.a(paramVarArgs);
      }
      if (this.qZf != null) {
        paramVarArgs.g(9, this.qZf);
      }
      paramVarArgs.fT(10, this.qZg);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label850;
      }
    }
    label850:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.appId != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.appId);
      }
      i = paramInt;
      if (this.jkW != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jkW);
      }
      paramInt = i;
      if (this.jkX != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jkX);
      }
      i = paramInt;
      if (this.jkY != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jkY);
      }
      paramInt = i;
      if (this.bJT != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.bJT);
      }
      i = paramInt;
      if (this.sign != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.sign);
      }
      paramInt = i;
      if (this.rFz != null) {
        paramInt = i + f.a.a.a.fS(8, this.rFz.boi());
      }
      i = paramInt;
      if (this.qZf != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.qZf);
      }
      return i + f.a.a.a.fQ(10, this.qZg);
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
        zr localzr = (zr)paramVarArgs[1];
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
            localzr.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localzr.appId = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localzr.jkW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localzr.jkX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localzr.jkY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localzr.bJT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localzr.sign = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localzr.rFz = ((cr)localObject1);
            paramInt += 1;
          }
        case 9: 
          localzr.qZf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localzr.qZg = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/zr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */