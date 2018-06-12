package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class asz
  extends bhd
{
  public int jQd;
  public String jRi;
  public String lPl;
  public int rJr;
  public String rVi;
  public String rVj;
  public String rVk;
  public int rVl;
  public bhy rVm;
  public int rVn;
  public int rVo;
  public int rVp;
  public int rVq;
  public bhy rVr;
  public int rVs;
  public int rVt;
  public int rVu;
  public int rVv;
  public int rVw;
  public String rVx;
  public String rVy;
  public int rmo;
  public int rmp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rVm == null) {
        throw new b("Not all required fields were included: DataBuffer");
      }
      if (this.rVr == null) {
        throw new b("Not all required fields were included: ThumbData");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rVi != null) {
        paramVarArgs.g(2, this.rVi);
      }
      if (this.rVj != null) {
        paramVarArgs.g(3, this.rVj);
      }
      if (this.rVk != null) {
        paramVarArgs.g(4, this.rVk);
      }
      paramVarArgs.fT(5, this.jQd);
      paramVarArgs.fT(6, this.rVl);
      if (this.rVm != null)
      {
        paramVarArgs.fV(7, this.rVm.boi());
        this.rVm.a(paramVarArgs);
      }
      paramVarArgs.fT(8, this.rVn);
      paramVarArgs.fT(9, this.rVo);
      paramVarArgs.fT(10, this.rVp);
      paramVarArgs.fT(11, this.rVq);
      if (this.rVr != null)
      {
        paramVarArgs.fV(12, this.rVr.boi());
        this.rVr.a(paramVarArgs);
      }
      paramVarArgs.fT(13, this.rVs);
      paramVarArgs.fT(14, this.rVt);
      paramVarArgs.fT(15, this.rVu);
      paramVarArgs.fT(16, this.rVv);
      paramVarArgs.fT(17, this.rJr);
      paramVarArgs.fT(18, this.rVw);
      if (this.jRi != null) {
        paramVarArgs.g(19, this.jRi);
      }
      if (this.lPl != null) {
        paramVarArgs.g(20, this.lPl);
      }
      paramVarArgs.fT(21, this.rmp);
      paramVarArgs.fT(22, this.rmo);
      if (this.rVx != null) {
        paramVarArgs.g(23, this.rVx);
      }
      if (this.rVy != null) {
        paramVarArgs.g(24, this.rVy);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1582;
      }
    }
    label1582:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rVi != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rVi);
      }
      i = paramInt;
      if (this.rVj != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rVj);
      }
      paramInt = i;
      if (this.rVk != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rVk);
      }
      i = paramInt + f.a.a.a.fQ(5, this.jQd) + f.a.a.a.fQ(6, this.rVl);
      paramInt = i;
      if (this.rVm != null) {
        paramInt = i + f.a.a.a.fS(7, this.rVm.boi());
      }
      i = paramInt + f.a.a.a.fQ(8, this.rVn) + f.a.a.a.fQ(9, this.rVo) + f.a.a.a.fQ(10, this.rVp) + f.a.a.a.fQ(11, this.rVq);
      paramInt = i;
      if (this.rVr != null) {
        paramInt = i + f.a.a.a.fS(12, this.rVr.boi());
      }
      i = paramInt + f.a.a.a.fQ(13, this.rVs) + f.a.a.a.fQ(14, this.rVt) + f.a.a.a.fQ(15, this.rVu) + f.a.a.a.fQ(16, this.rVv) + f.a.a.a.fQ(17, this.rJr) + f.a.a.a.fQ(18, this.rVw);
      paramInt = i;
      if (this.jRi != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.jRi);
      }
      i = paramInt;
      if (this.lPl != null) {
        i = paramInt + f.a.a.b.b.a.h(20, this.lPl);
      }
      i = i + f.a.a.a.fQ(21, this.rmp) + f.a.a.a.fQ(22, this.rmo);
      paramInt = i;
      if (this.rVx != null) {
        paramInt = i + f.a.a.b.b.a.h(23, this.rVx);
      }
      i = paramInt;
      if (this.rVy != null) {
        i = paramInt + f.a.a.b.b.a.h(24, this.rVy);
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
        if (this.rVm == null) {
          throw new b("Not all required fields were included: DataBuffer");
        }
        if (this.rVr != null) {
          break;
        }
        throw new b("Not all required fields were included: ThumbData");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        asz localasz = (asz)paramVarArgs[1];
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
            localasz.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localasz.rVi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localasz.rVj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localasz.rVk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localasz.jQd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localasz.rVl = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localasz.rVm = ((bhy)localObject1);
            paramInt += 1;
          }
        case 8: 
          localasz.rVn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localasz.rVo = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localasz.rVp = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localasz.rVq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localasz.rVr = ((bhy)localObject1);
            paramInt += 1;
          }
        case 13: 
          localasz.rVs = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localasz.rVt = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 15: 
          localasz.rVu = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          localasz.rVv = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          localasz.rJr = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 18: 
          localasz.rVw = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 19: 
          localasz.jRi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 20: 
          localasz.lPl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 21: 
          localasz.rmp = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 22: 
          localasz.rmo = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 23: 
          localasz.rVx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localasz.rVy = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/asz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */