package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class zn
  extends bhd
{
  public int hFj;
  public String hFk;
  public String hFl;
  public String hFm;
  public String hFn;
  public String huU;
  public String hva;
  public b hxt;
  public int rFt;
  public int time_stamp;
  
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
      if (this.hva != null) {
        paramVarArgs.g(2, this.hva);
      }
      paramVarArgs.fT(3, this.hFj);
      if (this.hFk != null) {
        paramVarArgs.g(4, this.hFk);
      }
      if (this.hFl != null) {
        paramVarArgs.g(5, this.hFl);
      }
      paramVarArgs.fT(6, this.time_stamp);
      if (this.hFm != null) {
        paramVarArgs.g(7, this.hFm);
      }
      if (this.huU != null) {
        paramVarArgs.g(8, this.huU);
      }
      if (this.hFn != null) {
        paramVarArgs.g(9, this.hFn);
      }
      if (this.hxt != null) {
        paramVarArgs.b(10, this.hxt);
      }
      paramVarArgs.fT(11, this.rFt);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label780;
      }
    }
    label780:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hva != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hva);
      }
      i += f.a.a.a.fQ(3, this.hFj);
      paramInt = i;
      if (this.hFk != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.hFk);
      }
      i = paramInt;
      if (this.hFl != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hFl);
      }
      i += f.a.a.a.fQ(6, this.time_stamp);
      paramInt = i;
      if (this.hFm != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.hFm);
      }
      i = paramInt;
      if (this.huU != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.huU);
      }
      paramInt = i;
      if (this.hFn != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.hFn);
      }
      i = paramInt;
      if (this.hxt != null) {
        i = paramInt + f.a.a.a.a(10, this.hxt);
      }
      return i + f.a.a.a.fQ(11, this.rFt);
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
        zn localzn = (zn)paramVarArgs[1];
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
            localzn.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localzn.hva = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localzn.hFj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localzn.hFk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localzn.hFl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localzn.time_stamp = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localzn.hFm = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localzn.huU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localzn.hFn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localzn.hxt = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        }
        localzn.rFt = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/zn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */