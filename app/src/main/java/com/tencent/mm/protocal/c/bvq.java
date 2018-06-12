package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bvq
  extends bhd
{
  public String bKv;
  public int blZ;
  public String byN;
  public String dxK;
  public String sjf;
  public int ssb;
  public int ssc;
  public String ssd;
  public int sse;
  public String ssf;
  public LinkedList<bqr> ssg = new LinkedList();
  public int ssh;
  public int ssi;
  
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
      if (this.byN != null) {
        paramVarArgs.g(2, this.byN);
      }
      if (this.bKv != null) {
        paramVarArgs.g(3, this.bKv);
      }
      paramVarArgs.fT(4, this.ssb);
      paramVarArgs.fT(5, this.ssc);
      paramVarArgs.fT(6, this.blZ);
      if (this.ssd != null) {
        paramVarArgs.g(7, this.ssd);
      }
      if (this.sjf != null) {
        paramVarArgs.g(8, this.sjf);
      }
      if (this.dxK != null) {
        paramVarArgs.g(9, this.dxK);
      }
      paramVarArgs.fT(10, this.sse);
      if (this.ssf != null) {
        paramVarArgs.g(11, this.ssf);
      }
      paramVarArgs.d(12, 8, this.ssg);
      paramVarArgs.fT(13, this.ssh);
      paramVarArgs.fT(14, this.ssi);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label978;
      }
    }
    label978:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.byN != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.byN);
      }
      i = paramInt;
      if (this.bKv != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bKv);
      }
      i = i + f.a.a.a.fQ(4, this.ssb) + f.a.a.a.fQ(5, this.ssc) + f.a.a.a.fQ(6, this.blZ);
      paramInt = i;
      if (this.ssd != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.ssd);
      }
      i = paramInt;
      if (this.sjf != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.sjf);
      }
      paramInt = i;
      if (this.dxK != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.dxK);
      }
      i = paramInt + f.a.a.a.fQ(10, this.sse);
      paramInt = i;
      if (this.ssf != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.ssf);
      }
      return paramInt + f.a.a.a.c(12, 8, this.ssg) + f.a.a.a.fQ(13, this.ssh) + f.a.a.a.fQ(14, this.ssi);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.ssg.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        bvq localbvq = (bvq)paramVarArgs[1];
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
            localbvq.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbvq.byN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbvq.bKv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbvq.ssb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbvq.ssc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbvq.blZ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbvq.ssd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbvq.sjf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localbvq.dxK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localbvq.sse = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localbvq.ssf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bqr();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bqr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbvq.ssg.add(localObject1);
            paramInt += 1;
          }
        case 13: 
          localbvq.ssh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbvq.ssi = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bvq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */