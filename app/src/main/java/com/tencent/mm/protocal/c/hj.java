package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class hj
  extends bhp
{
  public int hcd;
  public int raE;
  public int raH;
  public bhy rcn;
  public bhy reB;
  public bhy rev;
  public bic rhO;
  public String rhV;
  public bhz rhY;
  public bhy rhZ;
  public int rib;
  public String ric;
  public String rid;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rcn == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rhV != null) {
        paramVarArgs.g(2, this.rhV);
      }
      if (this.rcn != null)
      {
        paramVarArgs.fV(3, this.rcn.boi());
        this.rcn.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.raH);
      paramVarArgs.fT(5, this.rib);
      if (this.ric != null) {
        paramVarArgs.g(6, this.ric);
      }
      paramVarArgs.fT(7, this.hcd);
      if (this.rid != null) {
        paramVarArgs.g(8, this.rid);
      }
      if (this.rhY != null)
      {
        paramVarArgs.fV(9, this.rhY.boi());
        this.rhY.a(paramVarArgs);
      }
      if (this.reB != null)
      {
        paramVarArgs.fV(10, this.reB.boi());
        this.reB.a(paramVarArgs);
      }
      if (this.rhZ != null)
      {
        paramVarArgs.fV(11, this.rhZ.boi());
        this.rhZ.a(paramVarArgs);
      }
      if (this.rhO != null)
      {
        paramVarArgs.fV(12, this.rhO.boi());
        this.rhO.a(paramVarArgs);
      }
      paramVarArgs.fT(13, this.raE);
      if (this.rev != null)
      {
        paramVarArgs.fV(14, this.rev.boi());
        this.rev.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1560;
      }
    }
    label1560:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rhV != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rhV);
      }
      i = paramInt;
      if (this.rcn != null) {
        i = paramInt + f.a.a.a.fS(3, this.rcn.boi());
      }
      i = i + f.a.a.a.fQ(4, this.raH) + f.a.a.a.fQ(5, this.rib);
      paramInt = i;
      if (this.ric != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.ric);
      }
      i = paramInt + f.a.a.a.fQ(7, this.hcd);
      paramInt = i;
      if (this.rid != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rid);
      }
      i = paramInt;
      if (this.rhY != null) {
        i = paramInt + f.a.a.a.fS(9, this.rhY.boi());
      }
      paramInt = i;
      if (this.reB != null) {
        paramInt = i + f.a.a.a.fS(10, this.reB.boi());
      }
      i = paramInt;
      if (this.rhZ != null) {
        i = paramInt + f.a.a.a.fS(11, this.rhZ.boi());
      }
      paramInt = i;
      if (this.rhO != null) {
        paramInt = i + f.a.a.a.fS(12, this.rhO.boi());
      }
      i = paramInt + f.a.a.a.fQ(13, this.raE);
      paramInt = i;
      if (this.rev != null) {
        paramInt = i + f.a.a.a.fS(14, this.rev.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rcn != null) {
          break;
        }
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        hj localhj = (hj)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localhj.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localhj.rhV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localhj.rcn = ((bhy)localObject1);
            paramInt += 1;
          }
        case 4: 
          localhj.raH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localhj.rib = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localhj.ric = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localhj.hcd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localhj.rid = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localhj.rhY = ((bhz)localObject1);
            paramInt += 1;
          }
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localhj.reB = ((bhy)localObject1);
            paramInt += 1;
          }
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localhj.rhZ = ((bhy)localObject1);
            paramInt += 1;
          }
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bic();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bic)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localhj.rhO = ((bic)localObject1);
            paramInt += 1;
          }
        case 13: 
          localhj.raE = ((f.a.a.a.a)localObject1).vHC.rY();
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
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localhj.rev = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/hj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */