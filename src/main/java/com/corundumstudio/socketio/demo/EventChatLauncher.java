�}Z  �   t&4n�X���u
��� �~�ٌv���,���]n�Gc#�By�=�d~�_bg�r��Ɏ���W�{����;j�b�� H8Yz�o��1�N�N�ŀR6��F]��8��.���`Bn(�|C8���/�1�H>I��á)�3C&���Еh���
��8��o�N��R+�砾5=L�@�cGi��s��mca��@k�W�\�'��Yߩ��Y<��N�$�k�+�(+��ⵓ�79�eog�?=k��.��їA,�nۘ{O	L1a=Pc�Vr��S�xh j�M� ��(���=
84�;��z@�wۤ��e�$�kEF��S�G�:�iA��C���#�jx3���u���Չ����)�0����5YմWZ�o6~
ڀȣ�u�*n��I^[��?��:9L=Ԏ7�d)�Y@,�ksq�j0}o8bach�ZCBZb�/D���v�"�bt����MDO
"ݼ0���x$� �n���8��SqI�y��soPnfig.setPort(9092);

        final SocketIOServer server = new SocketIOServer(config);
        server.addEventListener("chatevent", ChatObject.class, new DataListener<ChatObject>() {
            @Override
            public void onData(SocketIOClient client, ChatObject data, AckRequest ackRequest) {
                server.getBroadcastOperations().sendEvent("chatevent", data);
            }
        });

        server.start();

        Thread.sleep(Integer.MAX_VALUE);

        server.stop();
    }

}
