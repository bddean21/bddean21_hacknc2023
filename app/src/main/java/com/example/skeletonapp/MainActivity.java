package com.example.skeletonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void phalanges(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Phalanges (Foot)");
        intent.putExtra("image", R.drawable.phalanges);
        intent.putExtra("text", "The phalanges are the bones \n that make up the fingers \n of the hand and the \n toes of the foot. There \n  are 56 phalanges in the \n human body, with fourteen on \n each hand and foot. Three \n phalanges are present on each \n  finger and toe, with the \n exception of the thumb and \n large toe, which possess only \n two. The middle and far \n phalanges of the fourth and \n fifth toes are often fused \n together (symphalangism). The phalanges of \n the foot differ from the \n hand in that they are \n often shorter and more compressed,\n especially in the proximal phalanges,\n those closest to the torso.");
        startActivity(intent);
    }

    public void metatarsals(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Metatarsals");
        intent.putExtra("image", R.drawable.metatarsals);
        intent.putExtra("text", "The metatarsal bones, or metatarsus \n (pl: metatarsi), are a group \n of five long bones in \nthe midfoot, located between the \ntarsal bones (which forms the\n heel and the ankle) and\n the phalanges (toes). Lacking individual\n names, the metatarsal bones are\n numbered from the medial side \n(the side of the great\n toe): the first, second, third,\n fourth, and fifth metatarsal (often \ndepicted with Roman numerals). The\n metatarsals are analogous to the\n metacarpal bones of the hand.\n The lengths of the metatarsal\n bones in humans are, in\n descending order, second, third, fourth,\n fifth, and first.");
        startActivity(intent);
    }

    public void tarsals(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Tarsals");
        intent.putExtra("image", R.drawable.tarsals);
        intent.putExtra("text", "In the human body, the \ntarsus (pl: tarsi) is a \ncluster of seven articulating bones\n in each foot situated between\n the lower end of the\n tibia and the fibula of\n the lower leg and the\n metatarsus. It is made up\n of the midfoot (cuboid, medial,\n intermediate, and lateral cuneiform, and \nnavicular) and hindfoot (talus and \ncalcaneus).\n" +
                "\n" +
                "The tarsus articulates with the\n bones of the metatarsus, which\n in turn articulate with the\n proximal phalanges of the toes.\n The joint between the tibia\n and fibula above and the\n tarsus below is referred to \nas the ankle joint proper.\n" +
                "\n" +
                "In humans the largest bone\n in the tarsus is the \ncalcaneus, which is the weight-bearing\n bone within the heel of\n the foot.");
        startActivity(intent);
    }

    public void carpals(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Carpals");
        intent.putExtra("image", R.drawable.carpals);
        intent.putExtra("text",
                "The carpal bones are the\n eight small bones that make\n up the wrist (carpus) that\n connects the hand to the \nforearm. The term \"carpus\" and \n\"carpal\" is derived from the \nLatin carpus and the Greek\n καρπός (karpós), meaning \"wrist\". In\n human anatomy, the main role\n of the carpal bones is\n to articulate with the radial\n and ulnar heads to form\n a highly mobile condyloid joint \n(i.e. wrist joint),[1] to \nprovide attachments for thenar and\n hypothenar muscles, and to form\n part of the rigid carpal\n tunnel which allows the median\n nerve and tendons of the\n anterior forearm muscles to be\n transmitted to the hand and \nfingers.");
        startActivity(intent);
    }

    public void clavicle(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Clavicle");
        intent.putExtra("image", R.drawable.clavicle);
        intent.putExtra("text",
                "The clavicle, or collarbone, is\n a slender, S-shaped long bone \napproximately 6 inches (15 cm)\n long[1] that serves as a \nstrut between the shoulder blade\n and the sternum (breastbone). There\n are two clavicles, one on \nthe left and one on\n the right. The clavicle is \nthe only long bone in \nthe body that lies horizontally.\n[2] Together with the shoulder\n blade, it makes up the \nshoulder girdle. It is a\n palpable bone and, in people\n who have less fat in \nthis region, the location of\n the bone is clearly visible. \nIt receives its name from\n Latin clavicula 'little key' because \nthe bone rotates along its\n axis like a key when\n the shoulder is abducted. The\n clavicle is the most commonly\n fractured bone. It can easily\n be fractured by impacts to\n the shoulder from the force\n of falling on outstretched arms \nor by a direct hit.");
        startActivity(intent);
    }

    public void femur(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Femur");
        intent.putExtra("image", R.drawable.femur);
        intent.putExtra("text", "The femur (/ˈfiːmər/; pl: femurs \nor femora /ˈfɛmərə/), or thigh\n bone is the only bone\n in the thigh. The thigh \nis the region of the\n lower limb between the hip\n and the knee. In many\n four-legged animals the femur\n is the upper bone of\n the hindleg.\n" +
                "\n" +
                "The top of the femur \nfits into a socket in \nthe pelvis called the hip\n joint, and the bottom of\n the femur connects to the\n shinbone (tibia) and kneecap (patella) \nto form the knee. In\n humans the femur is the\n largest and thickest bone in\n the body.");
        startActivity(intent);
    }
    public void fibula(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Fibula");
        intent.putExtra("image", R.drawable.fibula);
        intent.putExtra("text", "The fibula (pl: fibulae or\n fibulas) or calf bone is \na leg bone on the\n lateral side of the tibia,\n to which it is connected\n above and below. It is \nthe smaller of the two\n bones and, in proportion to\n its length, the most slender\n of all the long bones.\n Its upper extremity is small,\n placed toward the back of\n the head of the tibia,\n below the knee joint and \nexcluded from the formation of\n this joint. Its lower extremity \ninclines a little forward, so\n as to be on a\n plane anterior to that of\n the upper end; it projects\n below the tibia and forms \nthe lateral part of the\n ankle joint.");
        startActivity(intent);
    }

    public void humerus(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Humerus");
        intent.putExtra("image", R.drawable.humerus);
        intent.putExtra("text",
                "The humerus (/ˈhjuːmərəs/; pl: humeri)\n is a long bone in\n the arm that runs from\n the shoulder to the elbow. \nIt connects the scapula and \nthe two bones of the\n lower arm, the radius and\n ulna, and consists of three \nsections. The humeral upper extremity\n consists of a rounded head, \na narrow neck, and two\n short processes (tubercles, sometimes called\n tuberosities). The body is cylindrical\n in its upper portion, and\n more prismatic below. The lower\n extremity consists of 2 epicondyles,\n 2 processes (trochlea & capitulum),\n and 3 fossae (radial fossa,\n coronoid fossa, and olecranon fossa).\n As well as its true\n anatomical neck, the constriction below \nthe greater and lesser tubercles \nof the humerus is referred\n to as its surgical neck\n due to its tendency to\n fracture, thus often becoming the\n focus of surgeons.");
        startActivity(intent);
    }

    public void mandible(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Mandible");
        intent.putExtra("image", R.drawable.mandible);
        intent.putExtra("text", "In anatomy, the mandible, lower\n jaw or jawbone is the\n bottom skeleton that makes up\n the lower (and typically also\n the more mobile) half of\n the mouth in jawed vertebrates.\n In arthropods, the largest pair\n of appendages of their mouthparts \n(responsible for biting and cutting \nfood) are also named mandibles.\n" +
                "\n" +
                "In human anatomy, the mandible\n is the largest, strongest and\n lowest bone in the human\n facial skeleton. It forms the \nlower jaw and holds the\n lower teeth in place. The \nmandible sits beneath the maxilla.\n It is the only movable \nbone of the skull (discounting \nthe ossicles of the middle\n ear),and is connected to\n the temporal bones by the\n temporomandibular joints.\n" +
                "\n" +
                "The bone is formed in\n the fetus from a fusion\n of the left and right\n mandibular prominences, and the point \nwhere these sides join, the \nmandibular symphysis, is still visible \nas a faint ridge in \nthe midline. Like other symphyses\n in the body, this is\n a midline articulation where the\n bones are joined by fibrocartilage, \nbut this articulation fuses together\n in early childhood.\n" +
                "\n" +
                "The word mandible derives from the\n Latin word mandibula 'jawbone' (literally, \n'one used for chewing'), from\n mandere 'to chew' and -bula\n (instrumental suffix).");
        startActivity(intent);
    }

    public void metacarpals(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Metacarpals");
        intent.putExtra("image", R.drawable.metacarpals);
        intent.putExtra("text",
                "In human anatomy, the metacarpal \nbones or metacarpus, also known\n as the \"palm bones\", are\n the appendicular bones that form \nthe intermediate part of the \nhand between the phalanges (fingers)\n and the carpal bones (wrist \nbones), which articulate with the\n forearm. The metacarpal bones are \nhomologous to the metatarsal bones\n in the foot.");
        startActivity(intent);
    }

    public void patella(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Patella");
        intent.putExtra("image", R.drawable.patella);
        intent.putExtra("text",
                "The patella (pl: patellae or \npatellas), also known as the \nkneecap, is a flat, rounded \ntriangular bone which articulates with\n the femur (thigh bone) and\n covers and protects the anterior\n articular surface of the knee\n joint. The patella is found\n in many tetrapods, such as\n mice, cats, birds and dogs,\n but not in whales, or\n most reptiles.\n" +
                "\n" +
                "In humans, the patella is \nthe largest sesamoid bone (i.e.,\n embedded within a tendon or\n a muscle) in the body.\n Babies are born with a\n patella of soft cartilage which\n begins to ossify into bone\n at about four years of \nage.");
        startActivity(intent);
    }
    public void pelvis(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Pelvis");
        intent.putExtra("image", R.drawable.pelvis);
        intent.putExtra("text", "The pelvis (pl: pelves or \npelvises) is the lower part \nof the trunk, between the\n abdomen and the thighs (sometimes\n also called pelvic region), together\n with its embedded skeleton (sometimes \nalso called bony pelvis, or\n pelvic skeleton). The pelvic region\n  The pelvic region of the \ntrunk includes the bony pelvis,\n the pelvic cavity (the space\n enclosed by the bony pelvis), \nthe pelvic floor, below the \npelvic cavity, and the perineum,\n below the pelvic floor. The\n pelvic skeleton is formed in \nthe area of the back,\n by the sacrum and the\n coccyx and anteriorly and to \nthe left and right sides, \nby a pair of hip \nbones. The two hip bones\n connect the spine with the \nlower limbs. They are attached \nto the sacrum posteriorly, connected \nto each other anteriorly, and \njoined with the two femurs\n at the hip joints. The\n gap enclosed by the bony\n pelvis, called the pelvic cavity,\n is the section of the\n body underneath the abdomen and \nmainly consists of the reproductive \norgans (sex organs) and the \nrectum, while the pelvic floor \nat the base of the\n cavity assists in supporting the \norgans of the abdomen. In\n mammals, the bony pelvis has\n a gap in the middle,\n significantly larger in females than\n in males. Their offspring pass\n through this gap when they\n are born.");
        startActivity(intent);
    }
    public void phalanges2(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Phalanges (Hand)");
        intent.putExtra("image", R.drawable.phalanges2);
        intent.putExtra("text", "The phalanges are the bones\n that make up the fingers\n of the hand and the \ntoes of the foot. There \nare 56 phalanges in the \nhuman body, with fourteen on\n each hand and foot. Three\n phalanges are present on each \nfinger and toe, with the\n exception of the thumb and\n large toe, which possess only two. The\n middle and far phalanges of \nthe fourth and fifth toes\n are often fused together (symphalangism).\nThe phalanges of the hand \nare commonly known as the \nfinger bones.");
        startActivity(intent);
    }

    public void ribcage(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Rib Cage");
        intent.putExtra("image", R.drawable.ribcage);
        intent.putExtra("text",
                "The rib cage is an \nendoskeletal enclosure in the thorax\n of most vertebrate animals that\n comprises the ribs, vertebral column\n and sternum, which protects vital\n organs such as the heart, \nlungs and great vessels. The \ncircumferential enclosure formed by left\n and right rib cages, together\n known as the thoracic cage,\n is a semi-rigid bony\n and cartilaginous structure which surrounds\n the thoracic cavity and supports \nthe shoulder girdles to form \nthe core part of the\n axial skeleton.\n" +
                "\n" +
                "A typical human thoracic cage\n consists of 12 pairs of \nribs and the adjoining costal \ncartilages, the sternum (along with\n the manubrium and xiphoid process),\n and the 12 thoracic vertebrae\n articulating with the ribs. The \nthoracic cage also provides attachments\n for extrinsic skeletal muscles of\n the neck, upper limbs, upper\n abdomen and back, and together \nwith the overlying skin and \nassociated fascia and muscles, makes\n up the thoracic wall.");
        startActivity(intent);
    }
    public void sacrum(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Sacrum");
        intent.putExtra("image", R.drawable.sacrum);
        intent.putExtra("text", "The sacrum (pl: sacra or s\nacrums), in human anatomy, is\n a large, triangular bone at \nthe base of the spine\n that forms by the fusing\n of the sacral vertebrae (S1–S5) \nbetween ages 18 and 30.\n" +
                "\n" +
                "The sacrum situates at the\n upper, back part of the\n pelvic cavity, between the two\n wings of the pelvis. It \nforms joints with four other \nbones. The two projections at\n the sides of the sacrum\n are called the alae (wings),\n and articulate with the ilium \nat the L-shaped sacroiliac joints. \nThe upper part of the\n sacrum connects with the last\n lumbar vertebra (L5), and its\n lower part with the coccyx \n(tailbone) via the sacral and \ncoccygeal cornua.\n" +
                "\n" +
                "The sacrum has three different \nsurfaces which are shaped to \naccommodate surrounding pelvic structures. Overall \nit is concave (curved upon\n itself). The base of the\n sacrum, the broadest and uppermost\n part, is tilted forward as\n the sacral promontory internally. The\n central part is curved outward\n toward the posterior, allowing greater\n room for the pelvic cavity.");
        startActivity(intent);
    }

    public void scapula(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Scapula");
        intent.putExtra("image", R.drawable.scapula);
        intent.putExtra("text", "The scapula (pl: scapulae or scapulas),\n also known as the shoulder\n blade, is the bone that \nconnects the humerus (upper arm \nbone) with the clavicle (collar\n bone). Like their connected bones, \nthe scapulae are paired, with\n each scapula on either side\n of the body being roughly\n a mirror image of the\n other. The name derives from \nthe Classical Latin word for\n trowel or small shovel, which\n it was thought to resemble.\n" +
                "\n" +
                "In compound terms, the prefix\n omo- is used for the\n shoulder blade in medical terminology. \nThis prefix is derived from \nὦμος (ōmos), the Ancient Greek \nword for shoulder, and is \ncognate with the Latin (h)umerus,\n which in Latin signifies either\n the shoulder or the upper \narm bone.\n" +
                "\n" +
                "The scapula forms the back\n of the shoulder girdle. In\n humans, it is a flat \nbone, roughly triangular in shape,\n placed on a posterolateral aspect \nof the thoracic cage.");
        startActivity(intent);
    }

    public void skull(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Skull");
        intent.putExtra("image", R.drawable.skull);
        intent.putExtra("text",
                "The skull is a \nbone protective cavity for the \nbrain. The skull is composed \nof four types of bone i.e., \ncranial bones, facial bones, ear\n ossicles and hyoid bone. However\n two parts are more prominent:\n the cranium (pl: craniums or\n crania) and the mandible. In humans,\n these two parts are the \nneurocranium (braincase) and the viscerocranium \n(facial skeleton) that includes the \nmandible as its largest bone.\n The skull forms the anterior-most\n portion of the skeleton and\n is a product of cephalisation—\nhousing the brain, and several\n sensory structures such as the\n eyes, ears, nose, and mouth.\n In humans these sensory structures\n are part of the facial \nskeleton.\n" +
                "\n" +
                "Functions of the skull include \nprotection of the brain, fixing\n the distance between the eyes \nto allow stereoscopic vision, and \nfixing the position of the \nears to enable sound localisation\n of the direction and distance\n of sounds. In some animals,\n such as horned ungulates (mammals\n with hooves), the skull also\n has a defensive function by\n providing the mount (on the\n frontal bone) for the horns.\n" +
                "\n" +
                "The English word skull is \nprobably derived from Old Norse\n skulle, while the Latin word \ncranium comes from the Greek\n root κρανίον (kranion). The human\n skull fully develops two years\n after birth.The junctions of\n the skull bones are joined\n by structures called sutures.\n" +
                "\n" +
                "The skull is made up\n of a number of fused\n flat bones, and contains many\n foramina, fossae, processes, and several\n cavities or sinuses. In zoology\n there are openings in the\n skull called fenestrae.");
        startActivity(intent);
    }
    public void spine(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Spine");
        intent.putExtra("image", R.drawable.spine);
        intent.putExtra("text", "The vertebral column, also known as the backbone or spine, is the core part of the axial skeleton in vertebrate animals. The vertebral column is the defining characteristic of vertebrate endoskeleton in which the notochord (a flexible collagen-wrapped glycoprotein rod) found in all chordates has been replaced by a segmented series of mineralized irregular bones (or sometimes, cartilages) called vertebrae, separated by fibrocartilaginous intervertebral discs (the center of which is a notochord remnant).[1] The dorsal portion of the vertebral column houses the spinal canal, a cavity formed by alignment of the neural arches that encloses and protects the spinal cord.");
        startActivity(intent);
    }

    public void sternum(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Sternum");
        intent.putExtra("image", R.drawable.sternum);
        intent.putExtra("text",
                "The sternum (pl: sternums or\n sterna) or breastbone is a \nlong flat bone located in \nthe central part of the\n chest. It connects to the\n ribs via cartilage and forms \nthe front of the rib\n cage, thus helping to protect \nthe heart, lungs, and major\n blood vessels from injury. Shaped\n roughly like a necktie, it\n is one of the largest\n and longest flat bones of \nthe body. Its three regions\n are the manubrium, the body, \nand the xiphoid process. The\n word sternum originates from Ancient\n Greek στέρνον (stérnon) 'chest'.");
        startActivity(intent);
    }

    public void tibia(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Tibia");
        intent.putExtra("image", R.drawable.tibia);
        intent.putExtra("text", "The tibia (/ˈtɪbiə/; pl: tibiae\n /ˈtɪbii/ or tibias), also known\n as the shinbone or shankbone,\n is the larger, stronger, and\n anterior (frontal) of the two\n bones in the leg below\n the knee in vertebrates (the\n other being the fibula, behind\n and to the outside of\n the tibia); it connects the\n knee with the ankle. The\n tibia is found on the\n medial side of the leg \nnext to the fibula and\n closer to the median plane.\n The tibia is connected to\n the fibula by the interosseous\n membrane of leg, forming a\n type of fibrous joint called\n a syndesmosis with very little\n movement. The tibia is named\n for the flute tibia. It\n is the second largest bone\n in the human body, after\n the femur. The leg bones\n are the strongest long bones\n as they support the rest\n of the body.");
        startActivity(intent);
    }
    public void ulna(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Ulna");
        intent.putExtra("image", R.drawable.ulna);
        intent.putExtra("text",
                "The ulna or ulnal bone\n (pl: ulnae or ulnas) is\n a long bone found in\n the forearm that stretches from \nthe elbow to the wrist,\n and when in anatomical position,\n is found on the medial \nside of the forearm. That\n is, the ulna is on \nthe same side of the \nforearm as the little finger.\n It runs parallel to the\n radius, the other long bone\n in the forearm. The ulna \nis longer and the radius\n is shorter, but the radius \nis thicker and the ulna\n is thinner. Therefore, the ulna \nis considered to be the\n smaller bone of the two\n bones in the lower arm.\n The corresponding bone in the \nlower leg is the fibula.");
        startActivity(intent);
    }

    public void radius(View view){
        Log.d("TAG", "Your debug message here");
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("title", "Radius");
        intent.putExtra("image", R.drawable.radius);
        intent.putExtra("text", "The radius or radial bone\n (pl: radii or radiuses) is\n one of the two large\n bones of the forearm, the\n other being the ulna. It \nextends from the lateral side\n of the elbow to the\n thumb side of the wrist\n and runs parallel to the\n ulna. The ulna is longer\n than the radius, but the\n radius is thicker. The radius \nis a long bone, prism-shaped\n and slightly curved longitudinally.\n" +
                "\n" +
                "The radius is part of\n two joints: the elbow and\n the wrist. At the elbow, \nit joins with the capitulum \nof the humerus, and in \na separate region, with the\n ulna at the radial notch.\n At the wrist, the radius\n forms a joint with the\n ulna bone.\n" +
                "\n" +
                "The corresponding bone in the\n lower leg is the tibia.");
        startActivity(intent);
    }
}